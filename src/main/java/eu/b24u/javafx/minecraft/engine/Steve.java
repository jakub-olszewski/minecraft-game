package eu.b24u.javafx.minecraft.engine;

import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.minecraft.cube.Cube;
import javafx.scene.paint.Color;

public class Steve extends Cube implements Ruch {

	public Steve(Plotno plotno, Punkt wspolrzedne) {
		super(plotno, wspolrzedne);
	}

	@Override
	protected void buduj(Plotno plotno) {
		Punkt p1 = wspolrzedne;
		Punkt p2 = new Punkt(10, 30);
		plotno.rysujPelnyProstokat(p1, p2, Color.BLUE);

		Punkt p3 = new Punkt(wspolrzedne.x - 5, wspolrzedne.y - 10);
		Punkt p4 = new Punkt(20, 20);
		plotno.rysujPelnyProstokat(p3, p4, Color.ROSYBROWN);
	}

	@Override
	public void przesunDoGory() {
		wspolrzedne.y -= 5;
	}

	@Override
	public void przesunWDol() {
		wspolrzedne.y += 5;

	}

	@Override
	public void przesunWLewo() {
		wspolrzedne.x -= 5;

	}

	@Override
	public void przesunWPrawo() {
		wspolrzedne.x += 5;

	}

}
