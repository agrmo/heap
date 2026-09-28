package haufen.klein.t;

import java.util.ArrayList;
import java.util.Arrays;

// haufen.klein.t.Main

public class Main {

    static void beispieleins() {
	int[] zahlen = new int[] {21,17,19};
	int[] partner = new int[] {1,2,3};

	TKleinhaufen<Integer> k = new TKleinhaufen<Integer>();

	for (int i = 0; i < zahlen.length; i++) {
	    k.fuege(zahlen[i], partner[i]);
	}

	int[] sortiert = new int[zahlen.length];
	int[] partnersortiert = new int[zahlen.length];
	int index = 0;
	
	while (k.liste.size() > 0) {
	    sortiert[index] = k.liste.get(0);
	    partnersortiert[index] = k.partner.get(0);
	    index += 1;
	    k.loesche(0);
	}

	System.out.println(Arrays.toString(sortiert));
	System.out.println(Arrays.toString(partnersortiert));
    }

    public static void main(String[] args) {
	beispieleins();
    }
}
