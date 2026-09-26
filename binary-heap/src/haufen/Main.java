package haufen;

import druck.baum.binaer.Binaerbaumdrucker;
import baum.binaer.Binaerbaum;

// haufen.Main

public class Main {

    static void beispieleins() {
	int[] l = new int[] {21,19,17,16,14,18,12,9,6,4,1};
	
	Binaerbaum b = Haufen.baumvonliste(l);

	System.out.println(Binaerbaumdrucker.drucke(b));
    }

    public static void main(String[] args) {
	beispieleins();
    }
}
