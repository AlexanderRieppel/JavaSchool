package A03SequencedList;

import java.util.ArrayList;

/**
 * Klasse die eine Liste auf der Basis einer Arraylist erstellt
 * @author Alexander Rieppel
 * @version 2012-11-21
 */
public class SequencedList {
	private ArrayList<SequenceElement> als = new ArrayList();
	/**
	 * Methode die ein übergebenes Element der Liste hinzufügt
	 * @param se		Element der Liste
	 */
	public void add(SequenceElement se){
		if(this.als.size()==0){
			this.als.add(se);
		}else{
			for(int i=0;i<this.als.size();i++){
				if(se.getSequenceNumber()<this.als.get(i).getSequenceNumber()){
					this.als.add(i,se);
					break;
				}
			}
		}
	}
	/**
	 * Gibt das erste Element der Liste zurück und und löscht es danach
	 * @return		Das erste Element
	 */
	public SequenceElement first(){
		SequenceElement se1 = als.get(0);
		als.remove(0);
		return se1;
	}
	/**
	 * Methode die den gesamten Inhalt der Liste in einem String zurückgibt
	 * 
	 * @return		Inhalt der Liste
	 */
	public String toString(){
		String txt="";
		for(int i = 0;i<this.als.size();i++){
			txt+=this.als.get(i).getSequenceNumber()+"\n";
		}
		return txt;
	}
	/**
	 * Getter-Methode
	 */
	private ArrayList<SequenceElement> getAls() {
		return als;
	}
	/**
	 * Setter-Methode
	 */
	private void setAls(ArrayList<SequenceElement> als) {
		this.als = als;
	}
}
