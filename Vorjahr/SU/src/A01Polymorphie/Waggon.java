package A01Polymorphie;

/**
 * @author RIEPPEL Alexander
 * @version 2012-10-17
 */
public class Waggon {
	private int nummer;
	private int eigenGewicht;
	
	/**
	 * Default-Konstruktor
	 */
	public Waggon (){
		this.nummer=(int)(Math.random()*100)+1;
		this.eigenGewicht=(int)(Math.random()*99999)+10000;
	}
	
	/**
	 * Konstruktor Waggon
	 * 
	 * @param nummer		Nummer des Waggons
	 * @param eigenGewicht	Eigengewicht des Waggons
	 */
	public Waggon (int nummer,int eigenGewicht){
		this.nummer=nummer;
		this.eigenGewicht=eigenGewicht;
	}
	
	
	/**
	 * Gibt alle techneischen Spezifikation zurück.
	 * @return		technische Spezifikationen
	 */
	public String getTechnischeSpezifikationen(){
		String tec = "";
		tec+="Nummer: "+getNummer();
		tec+="Gewicht: "+getEigenGewicht();
		return tec;
	}
	
	/**
	 * Getter- und Setter-Methoden
	 */
	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public int getEigenGewicht() {
		return eigenGewicht;
	}

	public void setEigenGewicht(int eigenGewicht) {
		this.eigenGewicht = eigenGewicht;
	}
	
}
