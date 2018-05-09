package eu.b24u;

import eu.b24u.javafx.Aplikacja;
import eu.b24u.javafx.Plotno;
import eu.b24u.javafx.Program;
import eu.b24u.javafx.Scena;
import eu.b24u.javafx.gra.PamiecGry;
import javafx.scene.paint.Color;

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
		scena.ustawRozmiar(640, 620);
		plotno.ustawRozmiar(640, 640);
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

		pamiecGry.wyczyscKratki();
		plotno.wypiszTekst(15, 30, 12, "Wygrane:" + pamiecGry.pobierzWygrane(), Color.GREEN);
		plotno.wypiszTekst(15, 50, 12, "Przegrane:" + pamiecGry.pobierzPrzegrane(), Color.RED);


	}

	@Override
	public void zdarzeniePrzeciagniecieMyszka(double x, double y, Plotno plotno) {
		// plotno.rysujPunkt(x, y);
	}

}
