package Backhausen_Dimitrijevic.Gui;

import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Daniel
 * 
 */
public class Linie extends Figuren {

	private Integer xkor2;
	private Integer ykor2;

	/**
	 * Default-Konstrutor mit den Kordinaten für Zeichenobjekte.
	 * 
	 */
	public Linie() {
		super();
		this.xkor2 = 1;
		this.ykor2 = 1;
	}

	/**
	 * Konstrutor mit den Kordinaten für Zeichenobjekte.
	 * 
	 * @param xkor
	 * @param ykor
	 * @param xkor2
	 * @param ykor2
	 */
	public Linie(Integer xkor, Integer ykor, Integer xkor2, Integer ykor2) {
		this(xkor, ykor, xkor2, ykor2, Color.black);
	}

	/**
	 * @param xkor
	 * @param ykor
	 * @param xkor2
	 * @param ykor2
	 * @param farbe
	 */
	public Linie(Integer xkor, Integer ykor, Integer xkor2, Integer ykor2,
			Color farbe) {
		this(xkor, ykor, xkor2, ykor2, farbe, false);
	}

	/**
	 * @param xkor
	 * @param ykor
	 * @param xkor2
	 * @param ykor2
	 * @param farbe
	 * @param gefuellt
	 */
	public Linie(Integer xkor, Integer ykor, Integer xkor2, Integer ykor2,
			Color farbe, boolean gefuellt) {
		super(xkor, ykor, farbe, gefuellt);
		this.xkor2 = xkor2;
		this.ykor2 = ykor2;
	}

	/**
	 * @return xkor2
	 */
	public Integer getXkor2() {
		return xkor2;
	}

	/**
	 * @param xkor2
	 */
	public void setXkor2(Integer xkor2) {
		this.xkor2 = xkor2;
	}

	/**
	 * @return ykor2
	 */
	public Integer getYkor2() {
		return ykor2;
	}

	/**
	 * @param ykor2
	 */
	public void setYkor2(Integer ykor2) {
		this.ykor2 = ykor2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see background1.Figuren#toString()
	 */
	@Override
	public String toString() {
		return "Ich bin eine Line: \n" + super.toString()
				+ "Mein 2. xKordinate ist: " + this.xkor2
				+ "\nMeine 2. yKordinate ist: " + this.ykor2;
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
		g.drawLine(super.getXkor(), super.getYkor(), this.xkor2, this.ykor2);
		g.setColor(c);
	}

}
