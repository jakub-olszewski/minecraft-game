package eu.b24u.javafx.minecraft.cube;

import eu.b24u.javafx.Plotno;
import eu.b24u.javafx.element.Punkt;
import javafx.scene.paint.Color;

public class GroundCube extends Cube {

	public GroundCube(Plotno plotno) {
		super(plotno);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Tworzenie kostki ziemia
	 * 
	 * @param plotno
	 *            na ktorym rysujemy
	 * @param punkt
	 *            w ktorym ma byc narysowana kostka ziemi
	 */
	public GroundCube(Plotno plotno, Punkt wspolrzedne) {
		super(plotno, wspolrzedne);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void buduj(Plotno plotno) {
		// TODO Auto-generated method stub
		Color kolor = Color.BROWN;
		Punkt p1 = wspolrzedne;
		Punkt p2 = new Punkt(dlugoscBoku, dlugoscBoku);
		plotno.rysujPelnyProstokat(p1, p2, kolor);
	}

}
