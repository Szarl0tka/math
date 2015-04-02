package math;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculTest extends Calcul {
	
	private Calcul calc;

	@Before
	public void setUp() throws Exception {
		this.calc = new Calcul();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddition() {
		double result = calc.addition(5,6);
		assertEquals(11, result,0);
	}

	@Test
	public void testSoustraction() {
		double result = calc.soustraction(6,5);
		assertEquals(1, result,0);
	}

	@Test
	public void testDivision() {
		double result = calc.division(6,2);
		assertEquals(3, result,0);
	}

	@Test
	public void testMultiplication() {
		double result = calc.multiplication(5,6);
		assertEquals(30, result,0);
	}

	@Test
	public void testRacine() {
		double result = calc.racine(9);
		assertEquals(3, result,0);
	}

}
