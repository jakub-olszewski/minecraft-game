package eu.b24u.javafx.minecraft.engine;

import eu.b24u.javafx.gra.PamiecGry;
import eu.b24u.javafx.gra.PamiecGryImpl;
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
		pamiecGry = new PamiecGryImpl(plotno);
		utworzNowaPlansze(plotno);
		pamiecGry.stworzSteve();

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
		utworzNowaPlansze(plotno);
		pamiecGry.przesunSteveDoGory();
		pamiecGry.rysujSteve();

		// new Steve(plotno, new Punkt(Program.losujLiczbe(0, 500),
		// Program.losujLiczbe(0, 500)));
	}

	@Override
	public void zdarzenieStrzalkaWDol() {
		utworzNowaPlansze(plotno);
		pamiecGry.przesunSteveWDol();
		pamiecGry.rysujSteve();

	}

	@Override
	public void zdarzenieStrzalkaWLewo() {
		utworzNowaPlansze(plotno);
		pamiecGry.przesunSteveWLewo();
		pamiecGry.rysujSteve();

	}

	@Override
	public void zdarzenieStrzalkaWPrawo() {
		utworzNowaPlansze(plotno);
		pamiecGry.przesunSteveWPrawo();
		pamiecGry.rysujSteve();

	}

}
