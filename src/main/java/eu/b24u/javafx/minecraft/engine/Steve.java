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
		Punkt rysowania = getWspolrzedne();
		Punkt glowa = rysowania.przesun(20, -5);

		plotno.rysujPelnyProstokat(glowa, new Punkt(20, 20), Color.ROSYBROWN);
		// pien jest przesuniety od punktu rysowania
		// o 25 na x
		// o 10 na y
		Punkt tulow = rysowania.przesun(25, 15);

		plotno.rysujPelnyProstokat(tulow, new Punkt(10, 25), Color.BLUE);
		// Punkt p1 = wspolrzedne;
		// Punkt p2 = new Punkt(10, 30);
		// plotno.rysujPelnyProstokat(p1, p2, Color.BLUE);
		//
		// Punkt p3 = new Punkt(wspolrzedne.x - 5, wspolrzedne.y - 10);
		// Punkt p4 = new Punkt(20, 20);
		// plotno.rysujPelnyProstokat(p3, p4, Color.ROSYBROWN);
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
