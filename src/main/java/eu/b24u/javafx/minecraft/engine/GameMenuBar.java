package eu.b24u.javafx.minecraft.engine;

import java.awt.HeadlessException;

import eu.b24u.javafx.gra.PamiecGry;
import eu.b24u.javafx.minecraft.engine.example.AktywnaPlansza;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class GameMenuBar extends MenuBar {

	/**
	 * metoda dodaje pod menu o nazwie caption do menu o nazwie main menu
	 * 
	 * @param caption
	 * @param mainMenu
	 * @param value
	 */
	private void addSubMenu(String caption, Menu mainMenu, EventHandler<ActionEvent> action) {
		MenuItem subMenu = new MenuItem(caption);
		subMenu.setOnAction(action);
		mainMenu.getItems().add(subMenu);
	}

	public GameMenuBar(Plotno plotno, PamiecGry pamiecGry) throws HeadlessException {
		super();

		Menu menuGame = new Menu("Game");

		addSubMenu("New", menuGame, action -> {
			plotno.czysc();
			pamiecGry.reset();
			new AktywnaPlansza(plotno, pamiecGry);
		});
		addSubMenu("Load", menuGame, null);
		addSubMenu("Save", menuGame, null);
		// MenuItem newMenu = new MenuItem("New");
		// menuGame.getItems().add(newMenu);

		// --- Menu Server
		Menu menuServer = new Menu("Server");
		addSubMenu("Connect", menuServer, null);
		addSubMenu("Create", menuServer, null);
		getMenus().addAll(menuGame, menuServer);
		setMinWidth(600);
		// menu end
	}

}
