package eu.b24u.javafx.minecraft.engine;

import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.minecraft.cube.Cube;
import javafx.scene.paint.Color;

public class Steve extends Cube {

	public Steve(Plotno plotno, Punkt wspolrzedne) {
		super(plotno, wspolrzedne);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void buduj(Plotno plotno) {
		// TODO Auto-generated method stub
		Punkt p1 = wspolrzedne;
		Punkt p2 = new Punkt(10, 30);
		plotno.rysujPelnyProstokat(p1, p2, Color.BLUE);

		Punkt p3 = new Punkt(wspolrzedne.x - 5, wspolrzedne.y - 10);
		Punkt p4 = new Punkt(20, 20);
		plotno.rysujPelnyProstokat(p3, p4, Color.ROSYBROWN);
	}

}
