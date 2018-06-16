package eu.b24u.javafx.minecraft.engine;

/**
 * To jest interfejs odpowiadający za ruch :) Interfejs to zbior metod, ktore
 * mozna zaimplementowac (zapisac sposob wykonania). Interfej mozna
 * zaimplementowac na wiele sposobow.
 * 
 * @author student
 *
 */
public interface Ruch {

	/**
	 * Metoda odpowiedzialna za przesuwa (ludzika) do góry
	 */
	public void przesunDoGory();

	public void przesunWDol();

	public void przesunWLewo();

	public void przesunWPrawo();

}
