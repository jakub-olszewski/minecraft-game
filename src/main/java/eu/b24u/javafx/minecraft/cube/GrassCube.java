package eu.b24u.javafx.minecraft.cube;

import eu.b24u.javafx.Plotno;
import eu.b24u.javafx.element.Punkt;
import javafx.scene.paint.Color;

public class GrassCube extends Cube {

	public GrassCube(Plotno plotno) {
		super(plotno);
	}

	@Override
	protected void buduj(Plotno plotno) {

		Color kolor = Color.GREEN;
		Punkt p1 = new Punkt(0, 0);
		Punkt p2 = new Punkt(dlugoscBoku, dlugoscBoku);
		plotno.rysujPelnyProstokat(p1, p2, kolor);
	}

}
