package A03SequencedList;

/**
 * Klasse die das Interface implementiert und die Funktionen von SequencedList testet
 * @author Alexander Rieppel
 *
 */
public class Schueler implements SequenceElement{
	private String name="";
	private int knr;
	
	/**
	 * Konstruktor für Artikel
	 * @param name		Artikelbezeichnung
	 * @param knr		Artikelnummer
	 */
	public Schueler(String name,int knr){
		this.name=name;
		this.knr=knr;
	}
	
	/**
	 * Gibt eine definierte Nummer zurück
	 * @return	Katalognummer
	 */
	@Override
	public int getSequenceNumber() {
		return this.getKnr();
	}
	
	/**
	 * Getter- und Setter-Methoden
	 */
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private int getKnr() {
		return knr;
	}
	private void setKnr(int knr) {
		this.knr = knr;
	}
	
	/**
	 * Testmethode die das Programm ausführt
	 */
	public static void main(String[] args){
		SequencedList list = new SequencedList();
		Schueler s1 = new Schueler("Max Mustermann",22);
		Schueler s2 = new Schueler("Max Mustermann",15);
		Schueler s3 = new Schueler("Max Mustermann",16);
		Schueler s4 = new Schueler("Max Mustermann",18);
		Schueler s5 = new Schueler("Max Mustermann",17);
		Schueler s6 = new Schueler("Max Mustermann",19);

		list.add(s1);
		list.add(s3);
		list.add(s5);
		list.add(s2);
		list.add(s4);
		list.add(s6);
		
		System.out.println(list.toString());
	}
}
