package haufen;

import baum.binaer.Binaerbaum;
import java.util.ArrayList;

public class Haufen {

    public static int elter(ArrayList<Integer> haufen, int i) {
	return (int) (haufen.get(i) / 2);
    }

    public static int links(ArrayList<Integer> haufen, int i) {
	return haufen.get(2*i);
    }

    public static int rechts(ArrayList<Integer> haufen, int i) {
	return haufen.get(2*i + 1);
    }

    // Geh durch der Liste und baue einen Binärbaum. Der Wert jedes
    // Knotens wird die Zahl in der Liste gezeigt.
    //
    // n.b. die Gleichungen
    // 2i
    // 2i+1
    // fangen mit dem Index 1 an, nicht 0. Also die Gleichungen
    // angefangen mit 0 sind...
    // 2(i+1)-1
    // 2(i+1)+1-1=2(i+1)
    //
    public static Binaerbaum baumvonliste(int[] liste) {

	int n = liste.length;
	ArrayList<Integer> zulaufenindex = new ArrayList<Integer>();
	ArrayList<Binaerbaum> zulaufenbaum = new ArrayList<Binaerbaum>();
	
	Binaerbaum ursprung = new Binaerbaum(liste[0]);
	zulaufenindex.add(0);
	zulaufenbaum.add(ursprung);
	
	while (zulaufenindex.size() > 0) {

	    int ende = zulaufenindex.size() - 1;
	    int zindex = zulaufenindex.remove(ende);
	    Binaerbaum zbaum = zulaufenbaum.remove(ende);

	    int indexlinks = 2 * (zindex + 1) - 1;
	    if (indexlinks < n) {
		Binaerbaum links = new Binaerbaum(liste[indexlinks]);

		System.out.println("Make left node: " + liste[indexlinks]);
		zulaufenindex.add(indexlinks);
		zulaufenbaum.add(links);
	    }

	    int indexrechts = 2 * (zindex + 1);
	    if (indexrechts < n) {
		Binaerbaum rechts = new Binaerbaum(liste[indexrechts]);

		System.out.println("Make right node: " + liste[indexrechts]);
		zulaufenindex.add(indexrechts);
		zulaufenbaum.add(rechts);
	    }
	}

	return ursprung;
    }

    // public static int[] listevonbaum(Binaerbaum baum) {}
}
