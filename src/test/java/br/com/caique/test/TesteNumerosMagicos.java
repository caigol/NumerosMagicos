package br.com.caique.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import br.com.caique.exception.FirstNumberHigherException;
import br.com.caique.exception.NotPositiveNumbersException;
import br.com.caique.service.NumerosMagicosService;

public class TesteNumerosMagicos {

	
	private NumerosMagicosService service = new NumerosMagicosService();
	
	@Test(expected = FirstNumberHigherException.class)
	public void testIsHigher() {
		service.isHigher(20, 5);
	}

	@Test(expected = NotPositiveNumbersException.class)
	public void testIsPositive() {
		service.isPositive(-5, 25);
	}

	@Test
	public void testIsPrime() {
		assertTrue(service.isPrime(9));
		
	}

	@Test
	public void testShowMagicNumbers() {
		assertEquals(service.showMagicNumbers(5, 20),12);
	}

}
