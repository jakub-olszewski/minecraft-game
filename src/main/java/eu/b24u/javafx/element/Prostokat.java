package eu.b24u.javafx.element;

import java.awt.Rectangle;

public class Prostokat extends Rectangle {

	private Punkt p1;
	private Punkt p2;

	public Prostokat(Punkt p1, Punkt p2) {
		super(p1.x, p1.y, p2.x, p2.y);
	}

	private static int getWidth(Punkt p1, Punkt p2) {
		return Math.abs(p1.x - p2.x);
	}

	private static int getHeight(Punkt p1, Punkt p2) {
		return Math.abs(p1.y - p2.y);
	}

	/**
	 * metoda sprawdza czy punkt x,y zawiera się w prostokącie
	 * 
	 * @param x
	 *            to współrzędna pozioma
	 * @param y
	 *            to współrzędna pionowa
	 * @return prawda jak zawiera się w prostokącie a fałsz jeśli nie
	 */
	public boolean czyZawieraPunkt(double x, double y) {
		return this.contains(x, y);
	}
}
