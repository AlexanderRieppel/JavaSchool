package A02Figuren;

import java.awt.Color;
import java.awt.Graphics;
/**
 * Klasse zur Erstellung und zeichnung eines zufälligen Polygons
 * 
 * @author Markus Schulmeister
 * @version 2012-11-07  v1.1
 */
public class Polygon extends Figur{

	private int[] xp = new int[5];
	private int[] yp = new int[5];
	
	/**
	 * Konstruktor zur Erstellung eines Polygon-Objekts
	 * 
	 * @param x		X-Koordinate
	 * @param y		Y-Koordinate
	 * @param c		Color-Objekt
	 */
	public Polygon(int x,int y,Color c){
		this.setKoordx(x);
		this.setKoordy(y);
		this.setColor(c);
		xp[0] = (int)(Math.random()*150+30)+x;
		xp[1] = (int)(Math.random()*150+30)+x;
		xp[2] = (int)(Math.random()*150+30)+x;
		xp[3] = (int)(Math.random()*150+30)+x;
		xp[4] = (int)(Math.random()*150+30)+x;
		yp[0] = (int)(Math.random()*150+30)+y;
		yp[1] = (int)(Math.random()*150+30)+y;
		yp[2] = (int)(Math.random()*150+30)+y;
		yp[3] = (int)(Math.random()*150+30)+y;
		yp[4] = (int)(Math.random()*150+30)+y;
	}
	
	/**
	 * Zeichnet ein zufälliges Polygon bei den Koordinatenangaben des Benutzers
	 */
	@Override
	public void draw(Graphics g1) {
		g1.setColor(getColor());
		g1.fillPolygon(xp, yp, 5);
	}

	/**
	 * Gibt den Namen der Figur zurück
	 */
	@Override
	public String toString() {
		return "Polygon";
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
