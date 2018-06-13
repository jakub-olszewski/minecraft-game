package eu.b24u.javafx.minecraft.cube;

import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.minecraft.engine.Plotno;
import eu.b24u.javafx.minecraft.util.CubeUtil;
import javafx.scene.paint.Color;

public abstract class Cube {

	Plotno plotno;
	public static int dlugoscBoku = 50;
	protected Punkt wspolrzedne;

	public Cube(Plotno plotno) {
		setPlotno(plotno);
		buduj(plotno);
		wspolrzedne = new Punkt(0, 0);
	}

	/**
	 * Metoda sprawdza czy kostka zawiera punkt
	 * @param punkt ktory jest sprawdzany
	 * @return prawda lub falsz
	 */
	public boolean czyZawiera(Punkt punkt) {
		return new CubeUtil(plotno).czyKostkaZawiera(this, punkt);
	}

	public Cube(Plotno plotno, Punkt wspolrzedne) {
		setWspolrzedne(wspolrzedne);
		setPlotno(plotno);
		buduj(plotno);
	}

	/**
	 * Odpowiedzialna za budowanie/tworzenie obiektu na plótnie
	 * 
	 * @param plotno
	 *            znajdujące się w grze
	 */
	protected abstract void buduj(Plotno plotno);

	protected void drawCube(Color kolor) {
		Punkt p1 = wspolrzedne;
		Punkt p2 = new Punkt(dlugoscBoku, dlugoscBoku);
		plotno.rysujPelnyProstokat(p1, p2, kolor);
	}


	public Plotno getPlotno() {
		return plotno;
	}

	public void setPlotno(Plotno plotno) {
		this.plotno = plotno;
	}

	public int getDlugoscBoku() {
		return dlugoscBoku;
	}

	public void setDlugoscBoku(int dlugoscBoku) {
		this.dlugoscBoku = dlugoscBoku;
	}

	public Punkt getWspolrzedne() {
		return wspolrzedne;
	}

	public void setWspolrzedne(Punkt wspolrzedne) {
		this.wspolrzedne = wspolrzedne;
	}

}
