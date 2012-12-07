package A01Polymorphie;

/**
 * @author RIEPPEL Alexander
 * @version 2012-10-17
 */
public class Gepaeckwagen extends Waggon{
	private int laderaum;
	private int maxGewicht;
	
	/**
	 * Default-Konstruktor
	 */
	public Gepaeckwagen() {
		super((int)(Math.random()*100)+1,10000);
		this.laderaum=1000;
		this.maxGewicht=50000;
	}
	
	/**
	 * Konstruktor Gepaeckwagen
	 * 
	 * @param nummer		Nummer des Wagens
	 * @param eigenGewicht	Eigengewicht
	 * @param laderaum		Laderaum Kapazitaet
	 * @param maxGewicht	Max. zulaessiges Gewicht
	 */
	public Gepaeckwagen(int nummer, int eigenGewicht, int laderaum, int maxGewicht) {
		super(nummer, eigenGewicht);
		this.laderaum=laderaum;
		this.maxGewicht=maxGewicht;
	}
	
	/**
	 * Getter- und Setter-Methoden
	 */
	public int getLaderaum() {
		return laderaum;
	}
	
	public void setLaderaum(int laderaum) {
		this.laderaum = laderaum;
	}
	
	public int getMaxGewicht() {
		return maxGewicht;
	}
	
	public void setMaxGewicht(int maxGewicht) {
		this.maxGewicht = maxGewicht;
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
		tec+="Laderaum: "+getLaderaum()+"\n";
		tec+="Maximales Gewicht: "+getMaxGewicht()+"\n";
		return tec;
	}
	
}
