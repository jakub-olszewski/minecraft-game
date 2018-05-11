package eu.b24u.javafx.minecraft.cube;

import eu.b24u.javafx.Plotno;

public abstract class Cube {

	Plotno plotno;
	protected int dlugoscBoku = 100;

	public Cube(Plotno plotno) {
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

}
