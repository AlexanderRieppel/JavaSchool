package A02Figuren;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Klasse zur Erstellung und Zeichnung eines zufälligen Ovals
 * 
 * @author Markus Schulmeister
 * @version 2012-11-07  v1.1
 */
public class Oval extends Figur{
	/**
	 * Konstruktor zur Erstellung eines Oval-Objekts
	 * 
	 * @param x		X-Koordinate
	 * @param y		Y-Koordinate
	 * @param c		Color-Objekt
	 */
	public Oval(int x,int y,Color c){
		this.setKoordx(x);
		this.setKoordy(y);
		this.setColor(c);
	}
	
	/**
	 * Zeichnet ein zufälliges Oval bei den Koordinatenangaben des Benutzers
	 */
	@Override
	public void draw(Graphics g1) {
		g1.setColor(getColor());
		g1.fillOval(getKoordx(),getKoordy(),(int)(Math.random()*100+50),(int)(Math.random()*100+50));
	}

	/**
	 * Gibt den Namen der Figur zurück
	 */
	@Override
	public String toString() {
		return "Oval";
	}

}
