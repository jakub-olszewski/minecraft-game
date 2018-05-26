package eu.b24u.javafx.minecraft.util;

import java.awt.Rectangle;

import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.minecraft.cube.Cube;
import eu.b24u.javafx.minecraft.cube.GrassCube;
import eu.b24u.javafx.minecraft.cube.GroundCube;
import eu.b24u.javafx.minecraft.cube.StoneCube;
import eu.b24u.javafx.minecraft.cube.WaterCube;
import eu.b24u.javafx.minecraft.engine.Plotno;

/**
 * Klasa odpowiedzialna za pomoc w rysowaniu kostek
 * 
 * @author student
 *
 */
public class CubeUtil {

	public enum CubeType {
		GROUND, WATER, STONE, GRASS
	};

	private Plotno plotno;

	public CubeUtil(Plotno plotno) {
		this.plotno = plotno;
	}

	/**
	 * Metoda sprawdza czy kostka zawiera punkt
	 * @param punkt ktory jest sprawdzany
	 * @return prawda lub falsz
	 */
	public boolean czyKostkaZawiera(Cube kostka, Punkt punkt) {
		Rectangle rect = new Rectangle(kostka.getWspolrzedne().x, kostka.getWspolrzedne().y, Cube.dlugoscBoku, Cube.dlugoscBoku);
		return rect.contains(punkt);
	}

	/**
	 * Metoda rysuje linie kostek pionowo
	 * 
	 * @param odIluY wspolrzedna pionowa od ktorej zaczynamy rysowac
	 * @param doIluY wspolrzedna pionowa do ktorej rysujemy
	 * @param x wspolrzedna pozioma rysowanej linii
	 * @param kostka typ kostki ktora rysujemy
	 */
	public void rysujLiniePionowo(int odIluY, int doIluY, int x, CubeType kostka) {
		/**
		 * Ponizej mamy petle for int y = odIluY; //ustawia poczate lini y < doIluY;
		 * //warunek ukonczenia rysowanie konczy sie gdy y > odIluY y += 50
		 * //zwiekszanie o 50 w kazdym roku petli
		 */
		for (int y = odIluY; y < doIluY; y += 50) {
			rysujKostke(x, y, kostka);
		}
	}

	private void rysujKostke(int x, int y, CubeType kostka) {
		switch (kostka) {
		case GROUND:
			new GroundCube(plotno, new Punkt(x, y));
			break;
		case WATER:
			new WaterCube(plotno, new Punkt(x, y));
			break;
		case STONE:
			new StoneCube(plotno, new Punkt(x, y));
			break;
		case GRASS:
			new GrassCube(plotno, new Punkt(x, y));
			break;
		default:
			new GrassCube(plotno, new Punkt(x, y));
		}
	}
}
