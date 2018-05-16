package eu.b24u.javafx.minecraft.engine;

import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.gra.PamiecGry;
import eu.b24u.javafx.minecraft.cube.GrassCube;
import eu.b24u.javafx.minecraft.engine.example.Plansza1;

public class MinecraftAplikacja extends Aplikacja {

	private PamiecGry pamiecGry;

	@Override
	public void zdarzenieKlikniecaMyszka(double x, double y, Plotno plotno) {
		Program.wypisz("x=" + x + " y=" + y);
	}


	/**
	 * Budowanie okna aplikacji po uruchomieniu<br>
	 * metoda wykonuje sie tylko raz!
	 */
	@Override
	public void budujScene(Scena scena, Plotno plotno) {
		scena.ustawTytul("Minecraft");
		scena.ustawRozmiar(630, 600);
		scena.zablokujOkno();
		plotno.ustawRozmiar(630, 600);
		pamiecGry = new PamiecGry();
		utworzNowaPlansze(plotno);
	}

	/**
	 * Tworzenie nowej planszy od poczatku
	 * 
	 * @param plotno
	 */
	private void utworzNowaPlansze(Plotno plotno) {
		plotno.czysc();

		// pamiecGry.wyczyscKratki();
		// plotno.wypiszTekst(15, 30, 12, "Wygrane:" + pamiecGry.pobierzWygrane(),
		// Color.GREEN);
		// plotno.wypiszTekst(15, 50, 12, "Przegrane:" + pamiecGry.pobierzPrzegrane(),
		// Color.RED);

		new Plansza1(plotno);

	}

	@Override
	public void zdarzeniePrzeciagniecieMyszka(double x, double y, Plotno plotno) {
		// plotno.rysujPunkt(x, y);
	}

	@Override
	public void zdarzenieStrzalkaWGore() {
		plotno.czysc();
		new GrassCube(plotno, new Punkt(Program.losujLiczbe(0, 500), Program.losujLiczbe(0, 500)));
	}

}
