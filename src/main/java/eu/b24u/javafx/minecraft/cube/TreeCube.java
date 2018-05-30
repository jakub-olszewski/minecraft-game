package eu.b24u.javafx.minecraft.cube;

import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.minecraft.engine.Plotno;
import javafx.scene.paint.Color;

public class TreeCube extends Cube {

	public TreeCube(Plotno plotno, Punkt wspolrzedne) {
		super(plotno, wspolrzedne);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void buduj(Plotno plotno) {
		// punkt rysowania to punkt ktory wpisujemy
		// w drugim argumencie czyli...
		// TreeCube(argument_pierwszy,argument_drugi);
		Punkt rysowania = getWspolrzedne();

		// pien jest przesuniety od punktu rysowania
		// o 25 na x
		// o 10 na y
		Punkt pienPunkt = rysowania.przesun(25, 10);

		// rysujemy prostokat o kolorze BROWN
		// w punkcie pienPunkt o wymiarach
		// szerokosci 5 i wysokosci 30
		// kolor rgb
		// https://www.w3schools.com/colors/colors_rgb.asp
		plotno.rysujPelnyProstokat(pienPunkt, 30, 10, Color.rgb(85, 0, 0));

		// rysujemy prostokat o kolorze DARKGREEN
		// w punkcie koronaPunkt o wymiarach
		// szerokosci 30 i wysokosci 30
		Punkt koronaPunkt = rysowania.przesun(15, -10);
		plotno.rysujPelnyProstokat(koronaPunkt, 30, 30, Color.DARKGREEN);
		
	}

}
