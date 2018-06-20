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
	List<Punkt> listaMushrooms;
	List<Punkt> listaTrees;
	String fileName = "pamiecGry.ser";
	Plansza plansza;
	int iloscPunktow;
	int iloscKrokow;
	private List<Punkt> listaPunktowSniegu;

	/**
	 * Konstruktor pamieci gry, tworzy nowa pamiec gry
	 * 
	 * @param plotno
	 */
	public PamiecGryImpl(Plotno plotno) {
		this.plotno = plotno;
		init();
	}

	public void init() {
		// tworzenie listy miejsc wykopanych
		this.wykopaneMiejsca = new Lista<>();
		// tworzenie listy grzybkow
		utworzListeMushrooms();
		utworzListeTrees();
		utworzListePunktowSniegu();
		iloscPunktow = 0;
		iloscKrokow = 0;
	}

	/**
	 * tworzy liste wylosowanych punktów w którzych będą narysowane drzewa
	 */
	private void utworzListeTrees() {
		this.listaTrees = new Lista<>();
		for (int i = 1; i < 15; i++) {
			int y = Program.losujLiczbe(0, 600);
			int x = Program.losujLiczbe(0, 600);
			listaTrees.add(new Punkt(x, y));
		}
	}

	private void utworzListePunktowSniegu() {
		this.listaPunktowSniegu = new Lista<>();
		// TODO Auto-generated method stub

	}

	public void utworzListeMushrooms() {
		this.listaMushrooms = new Lista<>();
		// dodanie grzybka do listy

		// TODO zadanie stworz 50 grzybkow w losowych miejscach
		for (int i = 1; i < 50; i++) {
			int y = Program.losujLiczbe(0, 600);
			int x = Program.losujLiczbe(0, 600);
			listaMushrooms.add(new Punkt(x, y));
		}
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
		iloscKrokow += 1;
	}

	@Override
	public void rysujSteve() {
		steve = new Steve(plotno, steve.getWspolrzedne());
	}

	@Override
	public void przesunSteveWDol() {
		steve.przesunWDol();
		iloscKrokow += 1;

	}

	@Override
	public void przesunSteveWLewo() {
		steve.przesunWLewo();
		iloscKrokow += 1;

	}

	@Override
	public void przesunSteveWPrawo() {
		steve.przesunWPrawo();
		iloscKrokow += 1;

	}

	@Override
	public int pobierzPunkty() {
		return iloscPunktow;
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

	@Override
	public List<Punkt> pobierzMushrooms() {
		return listaMushrooms;
	}

	@Override
	public void zbierzMushroom() {

		for (Punkt mushroomPunkt : listaMushrooms) {
			if (steve.czyZawiera(mushroomPunkt)) {
				iloscPunktow += 1;
			}
		}
		listaMushrooms.removeIf(mushroomPunkt -> steve.czyZawiera(mushroomPunkt));

		// nie mozna usuwac elementow listy w petli mozna uzyc dodatkowej zmiennej a
		// potem usunac podliste
		// for (Punkt mushroomPunkt : listaMushrooms) {
		// if (steve.czyZawiera(mushroomPunkt)) {
		// listaMushrooms.remove(mushroomPunkt);
		// iloscPunktow += 1;
		// }
		// }
	}

	@Override
	public int pobierzKroki() {
		// TODO Auto-generated method stub
		return iloscKrokow;
	}

	@Override
	public List<Punkt> pobierzPunktySniegu() {
		// TODO Auto-generated method stub
		return listaPunktowSniegu;
	}

	@Override
	public List<Punkt> pobierzTrees() {
		return listaTrees;
	}

	@Override
	public void reset() {
		init();
	}

}
