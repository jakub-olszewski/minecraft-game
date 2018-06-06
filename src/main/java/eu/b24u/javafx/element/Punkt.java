package eu.b24u.javafx.element;

import java.awt.Point;

public class Punkt extends Point {

	public Punkt(int x, int y) {
		super(x, y);
	}

	/**
	 * Metoda przesuwa punkt
	 * 
	 * @param i
	 *            poziomo
	 * @param j
	 *            pionowo
	 * @return zwraca punkt po przesunieciu
	 */
	public Punkt przesun(int i, int j) {
		int nowyX = x + i;
		int nowyY = y + j;
		return new Punkt(nowyX, nowyY);
	}

}
