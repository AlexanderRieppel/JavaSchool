package Backhausen_Dimitrijevic.Gui;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;


/**
 * Die Zeichnung von den Figuren
 * @author Dominik
 */
public class Zeichnung extends JPanel{
	private ArrayList<Figuren> list;
	/**
	 * Der Konstruktor
	 */
	public Zeichnung(){
		this.list = new ArrayList<Figuren>();
	}
	/**
	 * Gibt die Liste der Figuren zurück
	 * @return die Liste
	 */
	public ArrayList<Figuren> getList() {
		return list;
	}
	/**
	 * setzt die Liste der zu Zeichnenden Figuren neu
	 * @param list die neue Liste
	 */
	public void setList(ArrayList<Figuren> list) {
		this.list = list;
	}
	/**
	 * Fügt eine neue Figur hinzu
	 * @param f die neue Figur
	 */
	public void addFigure(Figuren f){
		list.add(f);
		this.repaint();
	}
	/**
	 * löscht eine Figur aus der Liste
	 * @param index der index der Figur
	 */
	public void deleteFigur(Integer index){
		list.remove(list.get(index));
		this.repaint();
	}
	/**
	 * Die Zeichnung der Figuren
	 */
	@Override
	public void paint(Graphics g){
		
		for(Integer i = 0; i < list.size(); i++){
			list.get(i).draw(g);
		}
	}
}
