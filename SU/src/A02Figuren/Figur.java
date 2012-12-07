package A02Figuren;

import java.awt.*;

/**
 * Abstrakte Klasse Figur die als Attribut eine X-Koordinate, 
 * eine Y-Koordinate und ein Color-Objekt besitzt. Sie stellt eine Grundlage
 * f�r alle sp�teren Figuren dar.
 * 
 * @author Markus Schulmeister
 * @version 2012-11-07  v1.1
 */
public abstract class Figur {
	private int koordx;
	private int koordy;
	private Color color;
	
	/**
	 * Eine abstrakte Methode die sp�ter in den Subklassen von Figur �berschrieben wird
	 * @param g1	Graphics Parameter f�rs zeichnen
	 */
	public abstract void draw(Graphics g1);
	
	/**
	 * Eine abstrakte Methode die sp�ter in den Subklassen von Figur �berschrieben wird
	 */
	public abstract String toString();

	/**
	 * Getter- und Setter-Methoden
	 */
	public int getKoordx() {
		return koordx;
	}

	public void setKoordx(int koordx) {
		this.koordx = koordx;
	}

	public int getKoordy() {
		return koordy;
	}

	public void setKoordy(int koordy) {
		this.koordy = koordy;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}
