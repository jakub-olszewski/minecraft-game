package eu.b24u.javafx.minecraft.engine;

import java.awt.HeadlessException;

import eu.b24u.javafx.gra.PamiecGryImpl;
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

	public GameMenuBar(Plotno plotno) throws HeadlessException {
		super();

		Menu menuGame = new Menu("Game");

		addSubMenu("New", menuGame, action -> {
			plotno.czysc();
			new AktywnaPlansza(plotno, new PamiecGryImpl(plotno));
		});
		addSubMenu("Load", menuGame, null);
		addSubMenu("Save", menuGame, null);
		addSubMenu("Wypłać 100 zł", menuGame, null);
		// MenuItem newMenu = new MenuItem("New");
		// menuGame.getItems().add(newMenu);

		// MenuItem itemEffect = new MenuItem("Load");
		// menuFile.getItems().add(itemEffect);
		// MenuItem itemEffect2 = new MenuItem("Save");
		// menuFile.getItems().add(itemEffect2);
		// --- Menu Connect
		Menu menuEdit = new Menu("Connect");

		// --- Menu Server
		Menu menuView = new Menu("Server");

		getMenus().addAll(menuGame, menuEdit, menuView);
		setMinWidth(600);
		// menu end
	}

}
