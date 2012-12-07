package A01Polymorphie;

/**
 * @author RIEPPEL Alexander
 * @version 2012-10-17
 */
public class Personenwagen extends Waggon{
	private int raucherPlaetze;
	private int nichtRaucherPlaetze;
	
	/**
	 * Default-Konstruktor
	 */
	public Personenwagen() {
		super((int)(Math.random()*100)+1,30000);
		this.raucherPlaetze=50;
		this.nichtRaucherPlaetze=50;
	}
	
	/**
	 * Konstruktor Personenwagen
	 * 
	 * @param nummer				Nummer des Wagens
	 * @param eigenGewicht			Eigengewicht
	 * @param raucherPlaetze		Anzahl Raucherplaetze
	 * @param nichtRaucherPlaetze	Anzahl Nichtraucherplaetze
	 */
	public Personenwagen(int nummer, int eigenGewicht, int raucherPlaetze, int nichtRaucherPlaetze) {
		super(nummer, eigenGewicht);
		this.raucherPlaetze=raucherPlaetze;
		this.nichtRaucherPlaetze=nichtRaucherPlaetze;
	}
	
	/**
	 * Getter- und Setter-Methoden
	 */
	public int getRaucherPlaetze() {
		return raucherPlaetze;
	}
	
	public void setRaucherPlaetze(int raucherPlaetze) {
		this.raucherPlaetze = raucherPlaetze;
	}
	
	public int getNichtRaucherPlaetze() {
		return nichtRaucherPlaetze;
	}
	
	public void setNichtRaucherPlaetze(int nichtRaucherPlaetze) {
		this.nichtRaucherPlaetze = nichtRaucherPlaetze;
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
	
}
