package eu.b24u.javafx.minecraft.engine.example;

import eu.b24u.javafx.element.Lista;
import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.minecraft.cube.GrassCube;
import eu.b24u.javafx.minecraft.cube.GroundCube;
import eu.b24u.javafx.minecraft.cube.StoneCube;
import eu.b24u.javafx.minecraft.cube.WaterCube;
import eu.b24u.javafx.minecraft.engine.Plotno;
import eu.b24u.javafx.minecraft.util.CubeUtil;
import eu.b24u.javafx.minecraft.util.CubeUtil.CubeType;

public class Plansza1 {

	private Plotno plotno;

	public Plansza1(Plotno plotno) {
		this.plotno = plotno;
		buduj(plotno);
	}

	private void buduj(Plotno plotno2) {
		for (int x = 0; x < 600; x += 50) {
			for (int y = 0; y < 600; y += 50) {
				new GrassCube(plotno, new Punkt(x, y));
			}
		}

		Lista<GroundCube> sciezka = new Lista<>();
		sciezka.dodaj(new GroundCube(plotno, new Punkt(300, 300)));

		CubeUtil util = new CubeUtil(plotno);
		util.rysujLiniePionowo(50, 400, 100, CubeType.GROUND);

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