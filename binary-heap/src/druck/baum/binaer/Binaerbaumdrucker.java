package druck.baum.binaer;

import baum.binaer.Binaerbaum;

public class Binaerbaumdrucker {

    public static String drucke(Binaerbaum bo) {

	// Drucke die Knoten dieses Binärbaumes.
	StringBuilder sb = new StringBuilder();

	if (bo != null) {
	    sb.append(bo.wert + ": [");
	    sb.append(Binaerbaumdrucker.drucke(bo.links));
	    sb.append(", ");
	    sb.append(Binaerbaumdrucker.drucke(bo.rechts));
	    sb.append("]");
	} else {
	    sb.append("nichts");
	}
	
	return sb.toString();
    }
}
