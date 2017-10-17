package pl.b2b.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest

{
	@org.junit.Test
	public void policz() {
		int pierwszaLiczba = 2;
		int drugaLiczba = 3;

		assertEquals(5, pierwszaLiczba + drugaLiczba);

	}

	@Test
	public void odejmowanie() {
		int trzeciaLiczba = 7;
		int czwartaLiczba = 3;

		assertEquals(4, trzeciaLiczba - czwartaLiczba);
	}

	@Test
	public void mnożenie() {
		int piątaLiczba = 5;
		int szóstaLiczba = 4;

		assertEquals(20, piątaLiczba * szóstaLiczba);
	}

	@Test
	public void dzielenie() {
		int siódmaLiczba = 20;
		int ósmaLiczba = 4;
		if (ósmaLiczba == 0) {
			System.out.println("Nie dziel przez zero");
		} else {
			assertEquals(5, siódmaLiczba / ósmaLiczba);
		}
	}

	@Test
	public void przykladPetli1() {
		// for init zm;krok do której to wykonywać; inkrementacja
		for (int i = 3; i <= 30; i++) {
			if (i % 3 == 0) {
				System.out.println("element " + i);
			}
		}
	}

	@Test
	public void przykladPetli2() {
		// for init zm;krok do której to wykonywać; inkrementacja
		for (int i = 0; i <= 99; i++) {
			if (i % 2 != 0) {
				System.out.println("element " + i);
			}
		}

	}

	@Test
	public void przykladPetliZLiczbamiDziesietnymi() {
		// for init zm;krok do której to wykonywać; inkrementacja
		for (int i = 11; i < 23; i++) {
			int liczbaJednostek = i % 10;
			int liczbaDziesiątek = i / 10;
			System.out.println("suma cyfr liczby " + i + " to" + " " + (liczbaJednostek + liczbaDziesiątek));
		}
	}

	@Test
	public void przykladPetliZLiczbamiSumaWiekszaOd3() {
		// for init zm;krok do której to wykonywać; inkrementacja
		for (int i = 11; i < 23; i++) {
			int liczbaJednostek = i % 10;
			int liczbaDziesiątek = i / 10;
			int suma = liczbaJednostek + liczbaDziesiątek;
			if (suma > 3) {
				System.out.println(i);
			}
		}
	}
}
