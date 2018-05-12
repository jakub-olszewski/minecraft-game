package eu.b24u.javafx.minecraft.plansza;

import eu.b24u.javafx.Plotno;
import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.minecraft.cube.GrassCube;
import eu.b24u.javafx.minecraft.cube.GroundCube;
import eu.b24u.javafx.minecraft.cube.WaterCube;

public class Plansza1 {

	private Plotno plotno;

	public Plansza1(Plotno plotno) {
		this.plotno = plotno;
		buduj(plotno);
	}

	private void buduj(Plotno plotno2) {
		new GrassCube(plotno, new Punkt(0, 0));
		new GroundCube(plotno, new Punkt(300, 300));
		new GrassCube(plotno, new Punkt(50, 0));
		new GrassCube(plotno, new Punkt(0, 50));
		new WaterCube(plotno, new Punkt(564, 0));
		new WaterCube(plotno, new Punkt(564, 50));
		new GroundCube(plotno, new Punkt(300, 350));
		new GroundCube(plotno, new Punkt(300, 400));
		new GroundCube(plotno, new Punkt(300, 450));
		new GrassCube(plotno, new Punkt(300, 250));
	}

}
