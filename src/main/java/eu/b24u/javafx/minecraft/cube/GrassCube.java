package eu.b24u.javafx.minecraft.cube;

import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.minecraft.engine.Plotno;
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

		Punkt rysowania = getWspolrzedne();

		int wielkoscTrawy = 2;

		Punkt trawa = rysowania.przesun(10, 10);
		Color kolorMlodejTrawy = Color.rgb(103, 173, 0);

		// https://www.w3schools.com/colors/colors_rgb.asp
		plotno.rysujPelnyProstokat(trawa, wielkoscTrawy * 2, 1, kolorMlodejTrawy);

		wielkoscTrawy = 3;

		Punkt trawa2 = rysowania.przesun(25, 25);
		// https://www.w3schools.com/colors/colors_rgb.asp
		plotno.rysujPelnyProstokat(trawa2, wielkoscTrawy * 2, 1, kolorMlodejTrawy);

		wielkoscTrawy = 2;
		
		Punkt trawa3 = rysowania.przesun(40, 40);
		// https://www.w3schools.com/colors/colors_rgb.asp
		plotno.rysujPelnyProstokat(trawa3, wielkoscTrawy * 2, 1, kolorMlodejTrawy);

	}

}
