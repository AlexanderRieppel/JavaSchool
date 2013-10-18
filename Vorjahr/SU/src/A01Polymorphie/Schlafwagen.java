package A01Polymorphie;

import java.util.ArrayList;

/**
 * @author RIEPPEL Alexander
 * @version 2012-10-17
 */
public class Schlafwagen extends Waggon{
	private int anzDoppelbettAbteil;
	private int anzEinzelbettAbteil;
	private ArrayList<Abteil> colabt = new ArrayList<Abteil>();
	
	/**
	 * Default-Konstruktor
	 */
	public Schlafwagen(){
		super((int)(Math.random()*100)+1,35000);
		this.anzDoppelbettAbteil=15;
		this.anzEinzelbettAbteil=15;
	}
	
	/**
	 * Konstruktor Schlafwagen
	 * 
	 * @param nummer				Nummer des Wagens
	 * @param eigenGewicht			Eigengewicht
	 * @param anzDoppelbettAbteil	Anzahl der Doppelbettabteile
	 * @param anzEinzelbettAbteil	Anzahl der Einzelbettabteile
	 */
	public Schlafwagen(int nummer, int eigenGewicht, int anzDoppelbettAbteil,int anzEinzelbettAbteil, ArrayList<Abteil> colabt){
		super(nummer,eigenGewicht);
		this.anzDoppelbettAbteil=anzDoppelbettAbteil;
		this.anzEinzelbettAbteil=anzEinzelbettAbteil;
		this.colabt=colabt;
	}
	
	/**
	 * Getter- und Setter-Methoden
	 */
	public int getAnzDoppelbettAbteil() {
		return anzDoppelbettAbteil;
	}
	
	public void setAnzDoppelbettAbteil(int anzDoppelbettAbteil) {
		this.anzDoppelbettAbteil = anzDoppelbettAbteil;
	}
	
	public int getAnzEinzelbettAbteil() {
		return anzEinzelbettAbteil;
	}
	
	public void setAnzEinzelbettAbteil(int anzEinzelbettAbteil) {
		this.anzEinzelbettAbteil = anzEinzelbettAbteil;
	}
	
	/**
	 * Gibt alle techneischen Spezifikation zurück.
	 * @return		technische Spezifikationen
	 */
	@Override
	public String getTechnischeSpezifikationen(){
		String tec = "";
		tec+="Nummer: "+getNummer()+"\n";
		tec+="Gewicht: "+getEigenGewicht()+"\n";
		return tec;
	}
	
	/**
	 * Fuegt je nach Eingabeparameter ein Doppelbettabteil oder ein Einzelbettabteil hinzu
	 * 
	 * @param txt	Eingangsparameter fuer Abteil
	 */
	public void addAbteil(String txt){
		if(txt.charAt(0)=='e'||txt.charAt(0)=='E'){
			colabt.add(new EinzelbettAbteil());
		}else{
			if(txt.charAt(0)=='d'||txt.charAt(0)=='D'){
				colabt.add(new Doppelbettabteil());
			}else{
				System.err.println("Unzulässiger Parameter für ein Abteil!");
			}
		}
	}
	
}
