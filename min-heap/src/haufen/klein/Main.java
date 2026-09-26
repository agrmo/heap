package haufen.klein;

import java.util.ArrayList;
import druck.liste.Listedrucker;

// haufen.klein.Main

public class Main {

    static void beispieleins() {
	int[] zahlen = new int[] {21,19,17,16,14,18,12,9,6,4,1};
	
	Kleinhaufen k = new Kleinhaufen();
	
	for (int z : zahlen) {
	    k.fuege(z);
	}

	ArrayList<Integer> sortiert = new ArrayList<Integer>();
	
	while (k.liste.size() > 0) {
	    sortiert.add(k.liste.get(0));
	    k.loesche(0);
	}

	System.out.println(Listedrucker.druckeliste(sortiert));
    }

    public static void main(String[] args) {
	beispieleins();
    }
}
