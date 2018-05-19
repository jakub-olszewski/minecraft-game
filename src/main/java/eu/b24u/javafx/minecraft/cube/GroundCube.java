package eu.b24u.javafx.minecraft.cube;

import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.minecraft.engine.Plotno;
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
		drawCube(Color.BROWN);
	}

}
