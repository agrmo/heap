package haufen;

import baum.binaer.Binaerbaum;

// haufen.Main

public class Main {

    static void beispieleins() {
	int[] l = new int[] {1,2,5,10,3,7,11,15,17,20,9,15,8,16,21};
	
	Binaerbaum b = Haufen.baumvonliste(l);
    }

    public static void main(String[] args) {
	beispieleins();
    }
}
