package eu.b24u.javafx.minecraft.cube;

import eu.b24u.javafx.Plotno;
import eu.b24u.javafx.element.Punkt;
import javafx.scene.paint.Color;

public class GrassCube extends Cube {


	public GrassCube(Plotno plotno) {
		super(plotno);
	}

	/**
	 * Tworzenie kostki trawa
	 * 
	 * @param plotno
	 *            na ktorym rysujemy
	 * @param punkt
	 *            w ktorym ma byc narysowana kostka trawy
	 */
	public GrassCube(Plotno plotno, Punkt punkt) {
		super(plotno, punkt);
	}

	@Override
	protected void buduj(Plotno plotno) {
		// linijka ponizej zastepuje 4 linijki
		drawCube(Color.GREEN);
		// Color kolor = Color.GREEN;
		// Punkt p1 = wspolrzedne;
		// Punkt p2 = new Punkt(dlugoscBoku, dlugoscBoku);
		// plotno.rysujPelnyProstokat(p1, p2, kolor);
	}

}
