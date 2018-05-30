package eu.b24u.javafx.gra;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.commons.lang3.SerializationUtils;

import eu.b24u.javafx.element.Lista;
import eu.b24u.javafx.element.Punkt;
import eu.b24u.javafx.minecraft.engine.Plotno;
import eu.b24u.javafx.minecraft.engine.Program;
import eu.b24u.javafx.minecraft.engine.Steve;
import eu.b24u.javafx.minecraft.util.Plansza;

public class PamiecGryImpl implements PamiecGry {

	Steve steve;
	private Plotno plotno;
	List<Punkt> wykopaneMiejsca;
	String fileName = "pamiecGry.ser";
	Plansza plansza;

	public PamiecGryImpl(Plotno plotno) {
		this.plotno = plotno;
		this.wykopaneMiejsca = new Lista<>();
	}

	@Override
	public void stworzSteve() {
		steve = new Steve(plotno, wylosujWspolrzedne());
	}

	private Punkt wylosujWspolrzedne() {
		return new Punkt(Program.losujLiczbe(0, 500), Program.losujLiczbe(0, 500));

	}

	@Override
	public void przesunSteveDoGory() {
		steve.przesunDoGory();
	}

	@Override
	public void rysujSteve() {
		steve = new Steve(plotno, steve.getWspolrzedne());
	}

	@Override
	public void przesunSteveWDol() {
		steve.przesunWDol();


	}

	@Override
	public void przesunSteveWLewo() {
		steve.przesunWLewo();

	}

	@Override
	public void przesunSteveWPrawo() {
		steve.przesunWPrawo();

	}

	@Override
	public int pobierzPunkty() {
		return 0;
	}

	@Override
	public Punkt pobierzLokalizacjeSteve() {
		return steve.getWspolrzedne();
	}

	@Override
	public void niechSteveKopie() {
		int x = steve.getWspolrzedne().x;
		int y = steve.getWspolrzedne().y;
		wykopaneMiejsca.add(new Punkt(x, y));// dodaje wspolrzedne do miejsc wykopanych
		// new GroundCube(plotno, steve.getWspolrzedne());
	}

	@Override
	public List<Punkt> pobierzMiejscaWykopane() {
		// return - zwroc
		// metoda zwraca wykopane miejsca
		return wykopaneMiejsca;
	}
	
	@Override
	public void zapisz() {

		try {
			// File to serialize object to

			// New file output stream for the file
			FileOutputStream fos = new FileOutputStream(fileName);

			// Serialize String
			SerializationUtils.serialize("pamiecGry", fos);
			fos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void wczytaj() {
		try {
			// Open FileInputStream to the file
			FileInputStream fis = new FileInputStream(fileName);

			// Deserialize and cast into String
			String ser = (String) SerializationUtils.deserialize(fis);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public boolean czyIstniejeZapisGry() {
		return new File(fileName).exists();
	}

}
