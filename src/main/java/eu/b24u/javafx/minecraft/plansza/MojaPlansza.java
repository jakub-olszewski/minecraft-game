package eu.b24u.javafx.minecraft.plansza;

import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.gra.PamiecGry;
import eu.b24u.javafx.minecraft.cube.GrassCube;
import eu.b24u.javafx.minecraft.cube.GroundCube;
import eu.b24u.javafx.minecraft.cube.StoneCube;
import eu.b24u.javafx.minecraft.engine.Plotno;
import javafx.scene.paint.Color;

public class MojaPlansza {

	private Plotno plotno;
	private PamiecGry pamiecGry;

	public MojaPlansza(Plotno plotno, PamiecGry pamiecGry) {
		this.plotno = plotno;
		this.pamiecGry = pamiecGry;
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


		new GrassCube(plotno, new Punkt(300, 250));

		new GroundCube(plotno, new Punkt(250, 450));
		new GroundCube(plotno, new Punkt(200, 450));
		new GroundCube(plotno, new Punkt(150, 450));

		new StoneCube(plotno, new Punkt(150, 450));

		plotno.wypiszTekst(15, 30, 12, "Punkty:" + pamiecGry.pobierzPunkty(), Color.WHITE);

	}

}
