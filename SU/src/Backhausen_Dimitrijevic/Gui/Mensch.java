package Backhausen_Dimitrijevic.Gui;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Daniel
 * 
 */
public class Mensch extends Figuren {

	private Integer size;

	/**
	 * Default-Konstrutor mit den Kordinaten für Zeichenobjekte.
	 * 
	 */
	public Mensch() {
		super();
		this.size = 5;
	}

	/**
	 * Konstrutor mit den Kordinaten für Zeichenobjekte.
	 * 
	 * @param xkor
	 * @param ykor
	 * @param size
	 */
	public Mensch(Integer xkor, Integer ykor, Integer size) {
		this(xkor, ykor, size, Color.black);
	}

	/**
	 * @param xkor
	 * @param ykor
	 * @param size
	 * @param farbe
	 */
	public Mensch(Integer xkor, Integer ykor, Integer size, Color farbe) {
		this(xkor, ykor, size, farbe, false);
	}

	/**
	 * @param xkor
	 * @param ykor
	 * @param size
	 * @param farbe
	 * @param gefuellt
	 */
	public Mensch(Integer xkor, Integer ykor, Integer size, Color farbe,
			boolean gefuellt) {
		super(xkor, ykor, farbe, gefuellt);
		this.size = size;
	}

	/**
	 * @return size
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * @param size
	 */
	public void setSize(Integer size) {
		this.size = size;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see background1.Figuren#toString()
	 */
	@Override
	public String toString() {
		return "Ich bin ein Mensch: \n" + super.toString();
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
		if (super.getGefuellt()) {
			g.fillOval(super.getXkor() - this.size,
					super.getYkor() - this.size, this.size * 2, this.size * 2);
			g.drawLine(super.getXkor(), super.getYkor() + this.size,
					super.getXkor(), super.getYkor() + 6 * this.size);
			g.drawLine(super.getXkor(), super.getYkor() + 3 * this.size,
					super.getXkor() + 2 * this.size, super.getYkor()
							+ this.size);
			g.drawLine(super.getXkor(), super.getYkor() + 3 * this.size,
					super.getXkor() - 2 * this.size, super.getYkor()
							+ this.size);
			g.drawLine(super.getXkor(), super.getYkor() + 6 * this.size,
					super.getXkor() + 2 * this.size, super.getYkor() + 8
							* this.size);
			g.drawLine(super.getXkor(), super.getYkor() + 6 * this.size,
					super.getXkor() - 2 * this.size, super.getYkor() + 8
							* this.size);
		} else {
			g.drawOval(super.getXkor() - this.size,
					super.getYkor() - this.size, this.size * 2, this.size * 2);
			g.drawLine(super.getXkor(), super.getYkor() + this.size,
					super.getXkor(), super.getYkor() + 6 * this.size);
			g.drawLine(super.getXkor(), super.getYkor() + 3 * this.size,
					super.getXkor() + 2 * this.size, super.getYkor()
							+ this.size);
			g.drawLine(super.getXkor(), super.getYkor() + 3 * this.size,
					super.getXkor() - 2 * this.size, super.getYkor()
							+ this.size);
			g.drawLine(super.getXkor(), super.getYkor() + 6 * this.size,
					super.getXkor() + 2 * this.size, super.getYkor() + 8
							* this.size);
			g.drawLine(super.getXkor(), super.getYkor() + 6 * this.size,
					super.getXkor() - 2 * this.size, super.getYkor() + 8
							* this.size);
		}
		g.setColor(c);
	}

}
