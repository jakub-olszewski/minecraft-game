package eu.b24u.javafx.gra;

import java.util.List;

import eu.b24u.javafx.element.Punkt;

/**
 * 
 * @author student
 *
 */
public interface PamiecGry {

	/**
	 * 
	 */
	void stworzSteve();

	void rysujSteve();

	void przesunSteveDoGory();

	void przesunSteveWDol();

	void przesunSteveWLewo();

	void przesunSteveWPrawo();

	int pobierzPunkty();

	Punkt pobierzLokalizacjeSteve();

	/**
	 * Metoda dzieki ktorej steve kopie
	 */
	void niechSteveKopie();

	List<Punkt> pobierzMiejscaWykopane();

	boolean czyIstniejeZapisGry();

	void wczytaj();

	void zapisz();
}
