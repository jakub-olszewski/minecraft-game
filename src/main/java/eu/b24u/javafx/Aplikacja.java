package eu.b24u.javafx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public abstract class Aplikacja extends Application {
 
	protected Plotno plotno;

	@Override
    public void start(Stage primaryStage) {
		plotno = new Plotno();
		Scena scena = new Scena(primaryStage);
		Image image = new Image(getClass().getResourceAsStream("/icon.png"));

		scena.get().getIcons().add(image);
		budujScene(scena, plotno);
        Group root = new Group();
		plotno.setOnMouseClicked(event -> {
			zdarzenieKlikniecaMyszka(event.getX(), event.getY(), plotno);
		});
		plotno.setOnMouseDragged(event -> {
			zdarzeniePrzeciagniecieMyszka(event.getX(), event.getY(), plotno);
		});
		plotno.setFocusTraversable(true);

		plotno.setOnKeyPressed(new EventHandler<KeyEvent>() {

			@Override
			public void handle(KeyEvent event) {
				System.out.println("press key");
				handleEvent(event);
			}
		});

		root.getChildren().add(plotno);
		scena.get().setScene(new Scene(root));
		scena.get().show();
    }

	private void handleEvent(KeyEvent event) {
		if (event.getEventType() == KeyEvent.KEY_PRESSED && event.getCode() == KeyCode.UP) {
			zdarzenieStrzalkaWGore();
		}

	}

	public abstract void zdarzenieStrzalkaWGore();

	/**
	 * Metoda tworzy aplikacje ustawia tytul, rozmiar i zawartosc<br>
	 * Metoda wykonuje sie tylko raz! podczas tworzenia aplikacji
	 * 
	 * @param scena
	 *            zawartosc okna
	 * @param plotno
	 *            miejsce gdzie rysujemy
	 */
	public abstract void budujScene(Scena scena, Plotno plotno);

	public abstract void zdarzenieKlikniecaMyszka(double x, double y, Plotno plotno);

	public abstract void zdarzeniePrzeciagniecieMyszka(double x, double y, Plotno plotno);

	public Plotno pobierzPlotno() {
		return plotno;
	}


}


