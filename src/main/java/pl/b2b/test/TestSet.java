package pl.b2b.test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class TestSet {

	@Test
	public void czyIloscElementowWSetJestPrawidlowa() {
		Set<Integer> liczby = new HashSet<Integer>();
		liczby.add(3);
		liczby.add(2);
		liczby.add(9);

		assertEquals(3, liczby.size());
	}

	@Test
	public void czyIloscElementowWSetJestPrawidlowaPoUsunieciuElementow() {
		Set<Integer> liczby = new HashSet<Integer>();
		liczby.add(3);
		liczby.add(2);
		liczby.add(9);
		liczby.remove(new Integer(3));

		assertEquals(2, liczby.size());
	}

	@Test
	public void czySetZawieraWszystkieDanePoUsunieciuElementow() {
		Set<Integer> liczby = new HashSet<Integer>();
		liczby.add(3);
		liczby.add(2);
		liczby.add(9);
		liczby.remove(new Integer(3));
		boolean czyZawiera = liczby.contains(2);
		assertEquals(true, czyZawiera);
	}

	@Test
	public void czySetZawiera3i6() {
		Set<Integer> liczby = new HashSet<Integer>();
		liczby.add(3);
		liczby.add(2);
		liczby.add(9);

		boolean czyZawiera3 = liczby.contains(3);
	    boolean czyZawiera6 = liczby.contains(6);

		assertEquals(false, czyZawiera3 && czyZawiera6);
	}
}
