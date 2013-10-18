package A03SequencedList;

/**
 * Klasse die das Interface implementiert und die Funktionen von SequencedList testet
 * @author Alexander Rieppel
 *
 */
public class Artikel implements SequenceElement{
	private String bez="";
	private int artikelnr;
	
	/**
	 * Konstruktor für Artikel
	 * @param bez		Artikelbezeichnung
	 * @param artikelnr	Artikelnummer
	 */
	public Artikel(String bez,int artikelnr){
		this.bez=bez;
		this.artikelnr=artikelnr;
	}
	/**
	 * Gibt eine definierte Nummer zurück
	 * @return	Artikelnummer	
	 */
	@Override
	public int getSequenceNumber() {
		return this.getArtikelnr();
	}
	/**
	 * Getter- und Setter-Methoden
	 */
	private String getBez() {
		return bez;
	}
	private void setBez(String bez) {
		this.bez = bez;
	}
	private int getArtikelnr() {
		return artikelnr;
	}
	private void setArtikelnr(int artikelnr) {
		this.artikelnr = artikelnr;
	}
	
	/**
	 * Testmethode die das Programm ausführt
	 */
	public static void main(String[] args){
		SequencedList list = new SequencedList();
		Schueler s1 = new Schueler("DVD",8547854);
		Schueler s2 = new Schueler("BLU-RAY",4857864);
		Schueler s3 = new Schueler("PS3",7546156);
		Schueler s4 = new Schueler("XBOX",9898197);
		Schueler s5 = new Schueler("LCD-FERNSEHER",2217165);
		Schueler s6 = new Schueler("MP3",6746947);

		list.add(s1);
		list.add(s3);
		list.add(s5);
		list.add(s2);
		list.add(s4);
		list.add(s6);
		
		System.out.println(list.toString());
	}
}

