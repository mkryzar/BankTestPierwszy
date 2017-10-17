package pl.b2b.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestKolekcji {

	@Test
	public void testKolekcjiZLiczbamiInteger() {
		//List - uporządkowane
		//Set - nieuporządkowane
		
		List<Integer> liczby = new ArrayList<Integer>();
		liczby.add(2);
		liczby.add(4);
		liczby.add(3);
		
		assertEquals(3, liczby.size());
	}
	
	@Test
	public void testKolekcjiZLiczbamiDouble() {
		//List - uporządkowane
		//Set - nieuporządkowane
		
		List<Double> liczby = new ArrayList<Double>();
		liczby.add(2.0);
		liczby.add(4.0);
		liczby.add(3.0);
		
		assertEquals(3, liczby.size());
	}
	
	@Test
	public void testKolekcjiCzyZawiera2() {
		//List - uporządkowane
		//Set - nieuporządkowane
		
		List<Integer> liczby = new ArrayList<Integer>();
		liczby.add(2);
		liczby.add(4);
		liczby.add(3);
		
		boolean czyZawiera = liczby.contains(2);
		
		assertEquals(true, czyZawiera);
	}
	
	@Test
	public void testKolekcjiCzyNieZawieraElementuUsuniętego() {
		//List - uporządkowane
		//Set - nieuporządkowane
		
		List<Integer> liczby = new ArrayList<Integer>();
		liczby.add(2);
		liczby.add(4);
		liczby.add(3);
		
		liczby.remove(0);
		
		boolean czyZawiera = liczby.contains(2);
		
		assertEquals(false, czyZawiera);
	}
	
	@Test
	public void testKolekcjiCzyListaPoUsunieciuZmniejszylaRozmiar() {
		//List - uporządkowane
		//Set - nieuporządkowane
		
		List<Integer> liczby = new ArrayList<Integer>();
		liczby.add(2);
		liczby.add(4);
		liczby.add(3);
		
		liczby.remove(0);
		
		//boolean czyZawiera = liczby.contains(2);
		
		assertEquals(2, liczby.size());
	}
}
