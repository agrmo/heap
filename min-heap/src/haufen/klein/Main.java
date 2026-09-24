package haufen.klein;

// haufen.klein.Main

public class Main {

    static void beispieleins() {
	int[] zahlen = new int[] {1,4,5,3};

	Kleinhaufen k = new Kleinhaufen();
	
	for (int z : zahlen) {
	    k.fuege(z);
	}
    }

    public static void main(String[] args) {
	beispieleins();
    }
}
