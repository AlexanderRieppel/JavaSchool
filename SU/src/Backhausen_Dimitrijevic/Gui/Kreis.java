package Backhausen_Dimitrijevic.Gui;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Daniel
 * 
 */
public class Kreis extends Figuren {

	private Integer radius;

	/**
	 * Default-Konstrutor mit den Kordinaten für Zeichenobjekte.
	 */
	public Kreis() {
		super();
		this.radius = 1;
	}

	/**
	 * Konstrutor mit den Kordinaten für Zeichenobjekte.
	 * 
	 * @param xkor
	 * @param ykor
	 * @param radius
	 */
	public Kreis(Integer xkor, Integer ykor, Integer radius) {
		this(xkor, ykor, radius, Color.black);
	}

	/**
	 * @param xkor
	 * @param ykor
	 * @param radius
	 * @param farbe
	 */
	public Kreis(Integer xkor, Integer ykor, Integer radius, Color farbe) {
		super(xkor, ykor, farbe);
		this.radius = radius;
	}

	/**
	 * @param xkor
	 * @param ykor
	 * @param radius
	 * @param farbe
	 * @param gefuellt
	 */
	public Kreis(Integer xkor, Integer ykor, Integer radius, Color farbe,
			boolean gefuellt) {
		super(xkor, ykor, farbe, gefuellt);
		this.radius = radius;
	}

	/**
	 * @return radius
	 */
	public Integer getRadius() {
		return radius;
	}

	/**
	 * @param radius
	 */
	public void setRadius(Integer radius) {
		this.radius = radius;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see background1.Figuren#toString()
	 */
	@Override
	public String toString() {
		return "Ich bin ein Kreis: \n" + super.toString() + "Meine Radius:"
				+ this.radius;
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
			g.fillOval(super.getXkor() - this.radius, super.getYkor()
					- this.radius, this.radius * 2, this.radius * 2);
		else
			g.drawOval(super.getXkor() - this.radius, super.getYkor()
					- this.radius, this.radius * 2, this.radius * 2);
		g.setColor(c);
	}

}
