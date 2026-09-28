package haufen.klein;

import java.util.ArrayList;
import java.util.Arrays;

// haufen.klein.Main

public class Main {

    static void beispieleins() {
	int[] zahlen = new int[] {21,19,17,16,14,18,12,9,6,4,1};
	
	Kleinhaufen k = new Kleinhaufen();
	
	for (int z : zahlen) {
	    k.fuege(z);
	}

	int[] sortiert = new int[zahlen.length];
	int index = 0;
	
	while (k.liste.size() > 0) {
	    sortiert[index] = k.liste.get(0);
	    index += 1;
	    k.loesche(0);
	}

	System.out.println(Arrays.toString(sortiert));
    }

    public static void main(String[] args) {
	beispieleins();
    }
}
