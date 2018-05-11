package eu.b24u.javafx;

import javafx.stage.Stage;

public class Scena {

	private Stage stage;

	public Scena(javafx.stage.Stage stage) {
		this.stage = stage;
	}

	public void ustawTytul(String tytul) {
		stage.setTitle(tytul);
	}

	public void ustawRozmiar(double wysokosc, double szerokosc) {
		stage.setHeight(wysokosc);
		stage.setWidth(szerokosc);
	}

	/**
	 * Blokowanie zmiany wiekosci okna
	 */
	public void zablokujOkno() {
		stage.setResizable(false);
	}

	public Stage get() {
		return stage;
	}

}
