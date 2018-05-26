package eu.b24u.javafx.gra;

import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.minecraft.cube.GroundCube;
import eu.b24u.javafx.minecraft.engine.Plotno;
import eu.b24u.javafx.minecraft.engine.Program;
import eu.b24u.javafx.minecraft.engine.Steve;

public class PamiecGryImpl implements PamiecGry {

	Steve steve;
	private Plotno plotno;

	public PamiecGryImpl(Plotno plotno) {
		this.plotno = plotno;
	}

	@Override
	public void stworzSteve() {
		steve = new Steve(plotno, wylosujWspolrzedne());
	}

	private Punkt wylosujWspolrzedne() {
		return new Punkt(Program.losujLiczbe(0, 500), Program.losujLiczbe(0, 500));

	}

	@Override
	public void przesunSteveDoGory() {
		steve.przesunDoGory();
	}

	@Override
	public void rysujSteve() {
		steve = new Steve(plotno, steve.getWspolrzedne());
	}

	@Override
	public void przesunSteveWDol() {
		steve.przesunWDol();


	}

	@Override
	public void przesunSteveWLewo() {
		steve.przesunWLewo();

	}

	@Override
	public void przesunSteveWPrawo() {
		steve.przesunWPrawo();

	}

	@Override
	public int pobierzPunkty() {
		return 0;
	}

	@Override
	public Punkt pobierzLokalizacjeSteve() {
		return steve.getWspolrzedne();
	}

	@Override
	public void niechSteveKopie() {
		// tutaj trzeba napisac potrzebny kod
		new GroundCube(plotno, steve.getWspolrzedne());
	}
	

}
