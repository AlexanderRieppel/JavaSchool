package Backhausen_Dimitrijevic.Gui;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Daniel
 * 
 */
public class Rechteck extends Figuren {

	private Integer laenge;
	private Integer breite;

	/**
	 * Default-Konstrutor mit den Kordinaten für Zeichenobjekte.
	 * 
	 */
	public Rechteck() {
		super();
		this.breite = 1;
		this.laenge = 1;
	}

	/**
	 * Konstrutor mit den Kordinaten und breite* laenge für Zeichenobjekte.
	 * 
	 * @param xkor
	 * @param ykor
	 * @param laenge
	 * @param breite
	 */
	public Rechteck(Integer xkor, Integer ykor, Integer laenge, Integer breite) {
		this(xkor, ykor, laenge, breite, Color.black);
	}

	/**
	 * @param xkor
	 * @param ykor
	 * @param laenge
	 * @param breite
	 * @param farbe
	 */
	public Rechteck(Integer xkor, Integer ykor, Integer laenge, Integer breite,
			Color farbe) {
		super(xkor, ykor, farbe);
		this.laenge = laenge;
		this.breite = breite;
	}

	/**
	 * @param xkor
	 * @param ykor
	 * @param laenge
	 * @param breite
	 * @param farbe
	 * @param gefuellt
	 */
	public Rechteck(Integer xkor, Integer ykor, Integer laenge, Integer breite,
			Color farbe, boolean gefuellt) {
		super(xkor, ykor, farbe, gefuellt);
		this.laenge = laenge;
		this.breite = breite;
	}

	/**
	 * @return laenge
	 */
	public Integer getLaenge() {
		return laenge;
	}

	/**
	 * @param laenge
	 */
	public void setLaenge(Integer laenge) {
		this.laenge = laenge;
	}

	/**
	 * @return breite
	 */
	public Integer getBreite() {
		return breite;
	}

	/**
	 * @param breite
	 */
	public void setBreite(Integer breite) {
		this.breite = breite;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see background1.Figuren#toString()
	 */
	@Override
	public String toString() {
		return "Ich bin ein Recheck: \n" + super.toString()
				+ "Mein Breite ist: " + this.breite + "\nMeine Länge ist: "
				+ this.laenge;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see background1.Figuren#draw(java.awt.Graphics)
	 */
	@Override
	public void draw(Graphics g) {
		Color c = g.getColor();
		g.setColor(super.getFarbe());
		if (super.getGefuellt())
			g.fillRect(super.getXkor(), super.getYkor(), this.laenge,
					this.breite);
		else
			g.drawRect(super.getXkor(), super.getYkor(), this.laenge,
					this.breite);
		g.setColor(c);
	}

}
