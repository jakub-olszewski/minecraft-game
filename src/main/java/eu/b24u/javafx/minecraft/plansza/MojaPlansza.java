package eu.b24u.javafx.minecraft.plansza;

import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.minecraft.cube.GrassCube;
import eu.b24u.javafx.minecraft.cube.GroundCube;
import eu.b24u.javafx.minecraft.cube.StoneCube;
import eu.b24u.javafx.minecraft.cube.WaterCube;
import eu.b24u.javafx.minecraft.engine.Plotno;

public class MojaPlansza {

	private Plotno plotno;

	public MojaPlansza(Plotno plotno) {
		this.plotno = plotno;
		buduj(plotno);
	}

	private void buduj(Plotno plotno2) {
		for (int x = 0; x < 600; x += 50) {
			for (int y = 0; y < 600; y += 50) {
				new GrassCube(plotno, new Punkt(x, y));
			}
		}
		new GrassCube(plotno, new Punkt(0, 0));
		new GroundCube(plotno, new Punkt(300, 300));
		new GrassCube(plotno, new Punkt(50, 0));
		new GrassCube(plotno, new Punkt(0, 50));
		new WaterCube(plotno, new Punkt(550, 0));
		new WaterCube(plotno, new Punkt(550, 50));
		new GroundCube(plotno, new Punkt(300, 350));
		new GroundCube(plotno, new Punkt(300, 400));
		new GroundCube(plotno, new Punkt(300, 450));

		new GrassCube(plotno, new Punkt(300, 250));

		new GroundCube(plotno, new Punkt(250, 450));
		new GroundCube(plotno, new Punkt(200, 450));
		new GroundCube(plotno, new Punkt(150, 450));

		new StoneCube(plotno, new Punkt(150, 450));
	}

}
