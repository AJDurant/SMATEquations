package uk.ac.york.modules.testing;

import static org.junit.Assert.*;

import org.junit.Test;
import java.lang.Double;

//RN me fecit

public class TestSinusBasedEquation {

	//We expect that we can't get NaN results provided any valid input.
	@Test (expected = IllegalArgumentException.class)
	public void testSinusBasedEquationNaN() {
		/**
		 * Test method for {@link uk.ac.york.modules.testing.SinusBasedEquation#of(double)}.
		 */
		double b = Double.MAX_VALUE;
		int x = Integer.MAX_VALUE;
		SinusBasedEquation equi = new SinusBasedEquation (1, b, 1, 1);
		assertFalse (Double.isNaN(equi.of(x)));
	}
	
	//We cannot plot NaN powers
	@Test (expected = IllegalArgumentException.class)
	public void testSinusBasedEquationInfinitePower() {
		/**
		 * Test method for {@link uk.ac.york.modules.testing.SinusBasedEquation#of(double)}.
		 */
		double b = Math.PI/2;
		int x = 1;
		double c = Double.POSITIVE_INFINITY;
		SinusBasedEquation equi = new SinusBasedEquation (1, b, c, 1);
		assertFalse (Double.isNaN(equi.of(x)));
	}
	
	//We cannot plot infinite powers
	@Test
	public void testSinusBasedEquationInfinitePower2() {
		/**
		 * Test method for {@link uk.ac.york.modules.testing.SinusBasedEquation#of(double)}.
		 */
		double b = 0;
		int x = 1;
		double c = -1;
		SinusBasedEquation equi = new SinusBasedEquation (1, b, c, 1);
		assertTrue (Double.isFinite(equi.of(x)));
	}
	
	@Test
	public void testToString () {
		/**
		 * Test method for {@link uk.ac.york.modules.testing.FractionEquation#toString}.
		 */
		SinusBasedEquation equi = new SinusBasedEquation (1, 1, 1, 1);
		equi.toString();
	}

}
