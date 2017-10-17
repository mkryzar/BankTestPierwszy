package pl.b2b.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestKolekcjiZForeach {

	@Test
	public void testKolekcjiZElementemParzystym() {
		List<Integer> liczby = new ArrayList<Integer>();
		liczby.add(2);
		liczby.add(3);

		int licznik = 0;
		for (Integer zmienna : liczby) {
			if (zmienna > 2) {
				System.out.println(zmienna);
				licznik++;
			}

		}
		assertEquals(1, licznik);
	}

	@Test
	public void testKolekcjiZElementemNieparzystym() {
		List<Integer> liczby = new ArrayList<Integer>();
		liczby.add(2);
		liczby.add(3);
		liczby.add(1);
		liczby.add(21);

		int licznik = 0;

		for (Integer zmienna : liczby) {
			if (zmienna % 2 != 0) {
				System.out.println(zmienna);
				licznik++;
			}

		}
		assertEquals(3, licznik);
	}

	@Test
	public void testKolekcjiZElementemSumaMniejszaOd3() {
		List<Integer> liczby = new ArrayList<Integer>();
		liczby.add(22);
		liczby.add(21);

		int licznik = 0;

		for (Integer zmienna : liczby) {
			int liczbaJednostek = zmienna % 10;
			int liczbaDziesiatek = zmienna / 10;
			int suma = liczbaJednostek + liczbaDziesiatek;
			if (suma > 3) {
				licznik++;
			}

		}
		assertEquals(1, licznik);
	}

}
