package A01Polymorphie;

/**
 * @author RIEPPEL Alexander
 * @version 2012-10-17
 */
public class Abteil {
	private int id;

	/**
	 * Default-Konstruktor
	 */
	public Abteil(){
		this.id=(int)Math.random()*99999+1;
	}
	
	
	/**
	 * Konstruktor Abteil
	 * @param id	ID des Abteils
	 */
	public Abteil(int id){
		this.id=id;
	}
	
	/**
	 * Getter- und Setter-Methoden
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
