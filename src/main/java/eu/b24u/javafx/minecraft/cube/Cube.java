package eu.b24u.javafx.minecraft.cube;

import eu.b24u.javafx.Plotno;
import eu.b24u.javafx.element.Punkt;

public abstract class Cube {

	Plotno plotno;
	protected int dlugoscBoku = 100;
	protected Punkt wspolrzedne;

	public Cube(Plotno plotno) {
		setPlotno(plotno);
		buduj(plotno);
		wspolrzedne = new Punkt(0, 0);
	}

	public Cube(Plotno plotno, Punkt wspolrzedne) {
		setWspolrzedne(wspolrzedne);
		setPlotno(plotno);
		buduj(plotno);
	}

	protected abstract void buduj(Plotno plotno);

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
