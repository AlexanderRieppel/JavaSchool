package A02Figuren;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * Klasse zur Erstellung und zeichnung eines zufälligen Rechtecks
 * 
 * @author Markus Schulmeister
 * @version 2012-11-07  v1.1
 */
public class Rechteck extends Figur{
	
	/**
	 * Konstruktor zur Erstellung eines Rechteck-Objekts
	 * 
	 * @param x		X-Koordinate
	 * @param y		Y-Koordinate
	 * @param c		Color-Objekt
	 */
	public Rechteck(int x,int y,Color c){
		this.setKoordx(x);
		this.setKoordy(y);
		this.setColor(c);
	}

	/**
	 * Zeichnet ein zufälliges Rechteck bei den Koordinatenangaben des Benutzers
	 */
	@Override
	public String toString() {
		return "Rechteck";
	}

	/**
	 * Gibt den Namen der Figur zurück
	 */
	@Override
	public void draw(Graphics g1) {
		g1.setColor(this.getColor());
		g1.fillRect(getKoordx(),getKoordy(),(int)(Math.random()*100+50),(int)(Math.random()*100+50));
	}
}
