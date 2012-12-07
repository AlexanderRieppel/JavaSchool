package A01Polymorphie;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Testklasse
 * 
 * @author RIEPPEL Alexander
 * @version 2012-10-17
 */
public class TestPolymorphie {

	public static void main(String[] args) {
		ArrayList<Waggon> zug = new ArrayList<Waggon>();
		ArrayList<Abteil> swagencol = new ArrayList<Abteil>();
		zug.add(new Personenwagen());
		zug.add(new Gepaeckwagen());
		zug.add(new Schlafwagen());
		Schlafwagen swagen = new Schlafwagen(130,10000,1,1,swagencol);
		swagen.addAbteil("E");
		swagen.addAbteil("D");
		zug.add(swagen);
		zug.add(new Personenwagen(131,25000,30,30));
		zug.add(new Gepaeckwagen(132,15000,1500,80000));
		for(int i = 0;i<zug.size();i++){
			System.out.println(zug.get(i).getTechnischeSpezifikationen());
		}
	}

}
