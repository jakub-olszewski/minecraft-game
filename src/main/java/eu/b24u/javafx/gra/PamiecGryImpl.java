package eu.b24u.javafx.gra;

import java.util.List;

import eu.b24u.javafx.element.Lista;
import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.minecraft.engine.Plotno;
import eu.b24u.javafx.minecraft.engine.Program;
import eu.b24u.javafx.minecraft.engine.Steve;

public class PamiecGryImpl implements PamiecGry {

	Steve steve;
	private Plotno plotno;
	List<Punkt> wykopaneMiejsca;

	public PamiecGryImpl(Plotno plotno) {
		this.plotno = plotno;
		this.wykopaneMiejsca = new Lista<>();
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
		int x = steve.getWspolrzedne().x;
		int y = steve.getWspolrzedne().y;
		wykopaneMiejsca.add(new Punkt(x, y));// dodaje wspolrzedne do miejsc wykopanych
		// new GroundCube(plotno, steve.getWspolrzedne());
	}

	@Override
	public List<Punkt> pobierzMiejscaWykopane() {
		// return - zwroc
		// metoda zwraca wykopane miejsca
		return wykopaneMiejsca;
	}
	

}
