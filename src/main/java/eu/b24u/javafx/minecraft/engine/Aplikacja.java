package eu.b24u.javafx.minecraft.engine;

import java.util.logging.Logger;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public abstract class Aplikacja extends Application {
 
	protected Plotno plotno;
	private Logger log = Logger.getLogger(getClass().getName());


	@Override
    public void start(Stage primaryStage) {
		plotno = new Plotno();
		Scena scena = new Scena(primaryStage);
		Image image = new Image(getClass().getResourceAsStream("/icon.png"));

		MenuBar menuBar = new MenuBar();

		// --- Menu File
		Menu menuFile = new Menu("Game");

		MenuItem itemEffect3 = new MenuItem("New");
		menuFile.getItems().add(itemEffect3);
		MenuItem itemEffect = new MenuItem("Load");
		menuFile.getItems().add(itemEffect);
		MenuItem itemEffect2 = new MenuItem("Save");
		menuFile.getItems().add(itemEffect2);
		// --- Menu Edit
		Menu menuEdit = new Menu("Connect");

		// --- Menu View
		Menu menuView = new Menu("Server");

		menuBar.getMenus().addAll(menuFile, menuEdit, menuView);
		menuBar.setMinWidth(600);

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
				log.info("press key " + event);
				handleEvent(event);
			}
		});

		root.getChildren().add(plotno);
		root.getChildren().add(menuBar);

		scena.get().setScene(new Scene(root));
		scena.get().show();
    }

	private void handleEvent(KeyEvent event) {
		if (event.getEventType() == KeyEvent.KEY_PRESSED && event.getCode() == KeyCode.UP) {
			zdarzenieStrzalkaWGore();
		}
		if (event.getEventType() == KeyEvent.KEY_PRESSED && event.getCode() == KeyCode.DOWN) {
			zdarzenieStrzalkaWDol();
		}
		if (event.getEventType() == KeyEvent.KEY_PRESSED && event.getCode() == KeyCode.LEFT) {
			zdarzenieStrzalkaWLewo();
		}
		if (event.getEventType() == KeyEvent.KEY_PRESSED && event.getCode() == KeyCode.RIGHT) {
			zdarzenieStrzalkaWPrawo();
		}
		if (event.getEventType() == KeyEvent.KEY_PRESSED && event.getCode() == KeyCode.SPACE) {
			zdarzenieNaKlikniecieWSpacje();
		}
	}

	public abstract void zdarzenieStrzalkaWDol();

	public abstract void zdarzenieStrzalkaWLewo();

	public abstract void zdarzenieStrzalkaWPrawo();

	public abstract void zdarzenieStrzalkaWGore();

	/**
	 * Zdarzenie na klikniecie spacja
	 */
	public abstract void zdarzenieNaKlikniecieWSpacje();

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


