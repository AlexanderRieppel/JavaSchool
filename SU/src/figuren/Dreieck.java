package figuren;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Klasse zur Erstellung und zeichnung eines zufälligen Dreiecks
 * 
 * @author Markus Schulmeister
 * @version 2012-11-07  v1.1
 */
public class Dreieck extends Figur{
	private int[] xp = new int[3];
	private int[] yp = new int[3];
	
	/**
	 * Konstruktor zur Erstellung eines Dreieck-Objekts
	 * 
	 * @param x		X-Koordinate
	 * @param y		Y-Koordinate
	 * @param c		Color-Objekt
	 */
	public Dreieck(int x,int y,Color c){
		this.setKoordx(x);
		this.setKoordy(y);
		this.setColor(c);
		xp[0] = (int)(Math.random()*150+30)+x;
		xp[1] = (int)(Math.random()*150+30)+x;
		xp[2] = (int)(Math.random()*150+30)+x;
		yp[0] = (int)(Math.random()*150+30)+y;
		yp[1] = (int)(Math.random()*150+30)+y;
		yp[2] = (int)(Math.random()*150+30)+y;
	}
	
	/**
	 * Zeichnet ein zufälliges Dreieck bei den Koordinatenangaben des Benutzers
	 */
	@Override
	public void draw(Graphics g1) {
		g1.setColor(getColor());
		g1.fillPolygon(xp, yp, 3);
	}

	/**
	 * Gibt den Namen der Figur zurück
	 */
	@Override
	public String toString() {
		return "Dreieck";
	}

	/**
	 * Getter- und Setter-Methoden
	 */
	public int[] getXp() {
		return xp;
	}

	public void setXp(int[] xp) {
		this.xp = xp;
	}

	public int[] getYp() {
		return yp;
	}

	public void setYp(int[] yp) {
		this.yp = yp;
	}

}
