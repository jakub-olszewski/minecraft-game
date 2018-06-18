package eu.b24u.javafx.minecraft.engine.example;

import eu.b24u.javafx.element.Lista;
import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.gra.PamiecGry;
import eu.b24u.javafx.minecraft.cube.GrassCube;
import eu.b24u.javafx.minecraft.cube.GroundCube;
import eu.b24u.javafx.minecraft.cube.MushroomCube;
import eu.b24u.javafx.minecraft.cube.SnowCube;
import eu.b24u.javafx.minecraft.cube.StoneCube;
import eu.b24u.javafx.minecraft.cube.TreeCube;
import eu.b24u.javafx.minecraft.cube.WaterCube;
import eu.b24u.javafx.minecraft.engine.Plotno;
import eu.b24u.javafx.minecraft.engine.Program;
import eu.b24u.javafx.minecraft.util.CubeUtil;
import eu.b24u.javafx.minecraft.util.CubeUtil.CubeType;
import javafx.scene.paint.Color;

public class AktywnaPlansza {

	private Plotno plotno;
	private PamiecGry pamiecGry;


	public AktywnaPlansza(Plotno plotno, PamiecGry pamiecGry) {
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

		// petla for - tak ja petla w scratch
		for (Punkt miejsceWykopane : pamiecGry.pobierzMiejscaWykopane()) {
			// w tym miejscu jest rysowanie ziemi dla kazdego
			// miejsca wykopanego
			// i zapisanego w miejscach wykopanych w pamieci gry
			new GroundCube(plotno, miejsceWykopane);
		}

		for (Punkt miejsceMushroom : pamiecGry.pobierzMushrooms()) {
			new MushroomCube(plotno, miejsceMushroom);
		}




		Lista<GroundCube> sciezka = new Lista<>();
		sciezka.dodaj(new GroundCube(plotno, new Punkt(300, 300)));

		CubeUtil util = new CubeUtil(plotno);
		util.rysujLiniePionowo(50, 400, 100, CubeType.GROUND);

		util.rysujLiniePionowo(50, 400, 400, CubeType.WATER);
		// new GrassCube(plotno, new Punkt(0, 0));
		// new GroundCube(plotno, new Punkt(300, 300));
		// new GrassCube(plotno, new Punkt(50, 0));
		// new GrassCube(plotno, new Punkt(0, 50));
		new WaterCube(plotno, new Punkt(550, 50));
		new WaterCube(plotno, new Punkt(50, 0));
		new GroundCube(plotno, new Punkt(300, 350));
		new GroundCube(plotno, new Punkt(300, 400));
		new GroundCube(plotno, new Punkt(300, 450));
		new WaterCube(plotno, new Punkt(50, 600));

		;
		// new GrassCube(plotno, new Punkt(300, 250));

		new GroundCube(plotno, new Punkt(250, 450));
		new GroundCube(plotno, new Punkt(200, 450));
		new GroundCube(plotno, new Punkt(150, 450));

		new StoneCube(plotno, new Punkt(150, 450));

		plotno.wypiszTekst(15, 50, 16, "Punkty:" + pamiecGry.pobierzPunkty(), Color.WHITE);
		plotno.wypiszTekst(15, 70, 16, "Kroki:" + pamiecGry.pobierzKroki(), Color.WHITE);

		new TreeCube(plotno, new Punkt(350, 450));
		new TreeCube(plotno, new Punkt(420, 470));
		new TreeCube(plotno, new Punkt(410, 380));
		new TreeCube(plotno, new Punkt(460, 420));
		new TreeCube(plotno, new Punkt(490, 350));
		new TreeCube(plotno, new Punkt(390, 320));
		new GroundCube(plotno, new Punkt(100, 450));
		new GroundCube(plotno, new Punkt(150, 450));
		new GroundCube(plotno, new Punkt(100, 400));

		// % reszta z dzielenie
		if (pamiecGry.pobierzKroki() % 50 == 0) {
			int x = Program.losujLiczbe(1, 500);
			int y = Program.losujLiczbe(1, 800);
			Punkt snowPunkt = new Punkt(x, y);// punkt w ktorym rysujemy kostke sniegu
			// rysowanie kostki sniegu
			pamiecGry.pobierzPunktySniegu().add(snowPunkt);
			// new MushroomCube(plotno, new Punkt(0, 0));
		}
		for (Punkt miejsceSniegu : pamiecGry.pobierzPunktySniegu()) {
			new SnowCube(plotno, miejsceSniegu);
		}
		for (Punkt miejsceTree : pamiecGry.pobierzTrees()) {
			new TreeCube(plotno, miejsceTree);
		}
		
	}

}
