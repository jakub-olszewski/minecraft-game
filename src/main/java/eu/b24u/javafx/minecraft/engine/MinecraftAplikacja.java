package eu.b24u.javafx.minecraft.engine;

import eu.b24u.javafx.gra.PamiecGry;
import eu.b24u.javafx.gra.PamiecGryImpl;
import eu.b24u.javafx.minecraft.engine.example.AktywnaPlansza;

/**
 * Jest to klasa, czyli zbior metod i pol ktore moge byc zmiennymi lub innych
 * klas, obiektow
 * 
 * @author student
 *
 */
public class MinecraftAplikacja extends Aplikacja {

	private PamiecGry pamiecGry;

	@Override
	public void zdarzenieKlikniecaMyszka(double x, double y, Plotno plotno) {
		Program.wypisz("x=" + x + " y=" + y);
	}


	/**
	 * Budowanie okna aplikacji po uruchomieniu<br>
	 * metoda wykonuje sie tylko raz! W tej metodzie tworzyone jest okno i ustawiany
	 * jest jego rozmiar
	 */
	@Override
	public void budujScene(Scena scena, Plotno plotno) {
		scena.ustawTytul("Minecraft (Lernversion)");
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
		new AktywnaPlansza(plotno, pamiecGry);

		// new MojaPlansza(plotno, pamiecGry);

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
		pamiecGry.zbierzMushroom();


		// new Steve(plotno, new Punkt(Program.losujLiczbe(0, 500),
		// Program.losujLiczbe(0, 500)));
	}

	@Override
	public void zdarzenieStrzalkaWDol() {
		utworzNowaPlansze(plotno);
		pamiecGry.przesunSteveWDol();
		pamiecGry.rysujSteve();
		pamiecGry.zbierzMushroom();

	}

	@Override
	public void zdarzenieStrzalkaWLewo() {
		utworzNowaPlansze(plotno);
		pamiecGry.przesunSteveWLewo();
		pamiecGry.rysujSteve();
		pamiecGry.zbierzMushroom();

	}

	@Override
	public void zdarzenieStrzalkaWPrawo() {
		utworzNowaPlansze(plotno);
		pamiecGry.przesunSteveWPrawo();
		pamiecGry.rysujSteve();
		pamiecGry.zbierzMushroom();
	}

	@Override
	public void zdarzenieNaKlikniecieWSpacje() {
		utworzNowaPlansze(plotno);// tworzenie planszy od nowa
		pamiecGry.niechSteveKopie(); // kopanie w miejscu gdzie jest obecnie steve
		pamiecGry.rysujSteve();// rysowanie steve

	}

	@Override
	public GameMenuBar budujMenu() {
		GameMenuBar menuBar = new GameMenuBar(plotno, pamiecGry);
		return menuBar;
	}

}
