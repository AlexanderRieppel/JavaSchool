package Backhausen_Dimitrijevic.Gui;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Das ist die Hauptklasse Figuren die die Grundlage für die zu Zeichnenden
 * Figuren bietet.
 * 
 * @author Daniel
 */
public abstract class Figuren {
	private Integer xkor;
	private Integer ykor;
	private Color farbe;
	private boolean gefuellt;

	/**
	 * Default-Konstruktor
	 */
	public Figuren() {
		this(0, 0);
	}

	/**
	 * Konstrutor mit den Kordinaten für Zeichenobjekte.
	 * 
	 * @param xkor
	 *            Die xKordinate eines Zeichenobjektes
	 * @param ykor
	 *            Die YKordinate eines Zeichenobjektes
	 */

	public Figuren(Integer xkor, Integer ykor) {
		this(xkor, ykor, Color.BLACK);
	}

	/**
	 * @param xkor
	 * @param ykor
	 * @param farbe
	 */
	public Figuren(Integer xkor, Integer ykor, Color farbe) {
		this(xkor, ykor, farbe, false);
	}

	/**
	 * @param xkor
	 * @param ykor
	 * @param farbe
	 * @param gefuellt
	 */
	public Figuren(Integer xkor, Integer ykor, Color farbe, boolean gefuellt) {
		this.xkor = xkor;
		this.ykor = ykor;
		this.farbe = farbe;
		this.gefuellt = gefuellt;
	}

	/**
	 * @return xkor
	 */
	public Integer getXkor() {
		return xkor;
	}

	/**
	 * @param xkor
	 */
	public void setXkor(Integer xkor) {
		this.xkor = xkor;
	}

	/**
	 * @return ykor
	 */
	public Integer getYkor() {
		return ykor;
	}

	/**
	 * @param ykor
	 */
	public void setYkor(Integer ykor) {
		this.ykor = ykor;
	}

	/**
	 * @return farbe
	 */
	public Color getFarbe() {
		return farbe;
	}

	/**
	 * @param farbe
	 */
	public void setFarbe(Color farbe) {
		this.farbe = farbe;
	}

	/**
	 * @return gefuellt
	 */
	public boolean getGefuellt() {
		return gefuellt;
	}

	/**
	 * @param gefuellt
	 */
	public void setGefuellt(boolean gefuellt) {
		this.gefuellt = gefuellt;
	}

	/**
	 * @param g
	 */
	public abstract void draw(Graphics g);

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		if (this.gefuellt)
			return "Meine xKordinaten: " + this.xkor + "\nMeine yKordinaten: "
					+ this.ykor + "\n Ich bin gefüllt \n";
		else
			return "Meine xKordinaten: " + this.xkor + "\nMeine yKordinaten: "
					+ this.ykor + "\n Ich bin nicht gefüllt \n";
	}
}
