package eu.b24u.javafx.minecraft.cube;

import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.minecraft.engine.Plotno;
import javafx.scene.paint.Color;

public class SnowCube extends Cube {

	/**
	 * Tworzenie kostki woda
	 * 
	 * @param plotno na ktorym rysujemy
	 * @param pamiecGry
	 * @param punkt w ktorym ma byc narysowana kostka wody
	 */
	public SnowCube(Plotno plotno, Punkt wspolrzedne) {
		super(plotno, wspolrzedne);
	}

	@Override
	protected void buduj(Plotno plotno) {
		Punkt p1 = wspolrzedne;
		int dlugoscBoku = 4;
		Punkt p2 = new Punkt(dlugoscBoku, dlugoscBoku);
		plotno.rysujPelnyProstokat(p1, p2, Color.WHITE);
	}

}
