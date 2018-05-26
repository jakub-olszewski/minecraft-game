package eu.b24u.javafx.minecraft.cube;

import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.minecraft.engine.Plotno;
import javafx.scene.paint.Color;

public class WaterCube extends Cube {

	/**
	 * Tworzenie kostki woda
	 * 
	 * @param plotno na ktorym rysujemy
	 * @param pamiecGry
	 * @param punkt w ktorym ma byc narysowana kostka wody
	 */
	public WaterCube(Plotno plotno, Punkt wspolrzedne) {
		super(plotno, wspolrzedne);
	}

	@Override
	protected void buduj(Plotno plotno) {
		drawCube(Color.BLUE);
	}

}
