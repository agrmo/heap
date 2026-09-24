package haufen.klein;

import haufen.Haufen;
import java.util.ArrayList;

// Ein Binärbaum, worin jedes Elter kleiner ist.
public class Kleinhaufen {

    ArrayList<Integer> liste;

    // Am Anfang ist der Haufen leer.
    public Kleinhaufen() {
	this.liste = new ArrayList<Integer>();
    }

    // Verhaufe die Zahl nach oben (wenn sie zu klein ist).
    void verhaufenoben(int index) {

	int zahl = liste.get(index);
	int elter = Haufen.elter(liste, index);
	System.out.println(index + " elter " + elter);
	int elterzahl = liste.get(elter);

	if (elterzahl > zahl) {
	    System.out.println("tausche " + zahl + " " + elterzahl);
	    Haufen.tausche(liste, index, elter);
	    this.verhaufenoben(elter);
	}
    }

    // Verhaufe die Zahl nach unten (wenn sie groß ist).
    void verhaufenunten(int index) {

	int n = liste.size();

	if (2 * index > n) {
	    return;
	}

	int indexwert = liste.get(index);
	int j;
	int jwert;
	
	if (2 * index == n) {

	    // Nehme das Ende des Haufens.
	    j = 2 * index;
	    jwert = liste.get(j);
	    
	} else {

	    // garantiert 2 * index < n

	    // Nehme das Kind mit kleinerem Wert.
	    int linksindex = Haufen.links(liste, index);
	    int linkswert = liste.get(linksindex);
	    int rechtsindex = Haufen.rechts(liste, index);
	    int rechtswert = liste.get(rechtsindex);

	    if (linkswert < rechtswert) {
		j = linksindex;
		jwert = linkswert;
	    } else {
		j = rechtsindex;
		jwert = rechtswert;
	    }
	}

	if (jwert < indexwert) {
	    Haufen.tausche(liste, jwert, indexwert);
	    verhaufenunten(jwert);
	}
    }

    // Füge die Zahl in dem Haufen.
    // Die Größe der Liste wird eine Stelle kleiner.
    void fuege(int zahl) {

	int index = this.liste.size();
	this.liste.add(zahl);
	this.verhaufenoben(index);
    }

    // Lösche die Zahl aus dem Haufen.
    // Die Größe der Liste wird eine Stelle großer.
    //
    // 1. Tausche i mit der letzten Zahl der Liste
    // 2. Lösche die letzte Zahl
    // 3. Verhaufen nach unten.
    //
    void loesche(int index) {

	int endindex = liste.size() - 1;
	Haufen.tausche(liste, index, endindex);
	liste.remove(endindex);
	verhaufenunten(index);
    }
}
