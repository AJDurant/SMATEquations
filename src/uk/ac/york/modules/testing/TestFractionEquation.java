package uk.ac.york.modules.testing;

import static org.junit.Assert.*;

import org.junit.Test;

//RN me fecit

public class TestFractionEquation {

	//Test division by zero
	@Test (expected = IllegalArgumentException.class)
	public void testFractionEquationDivisionZero() {
		/**
		 * Test method for {@link uk.ac.york.modules.testing.FractionEquation#of(double)}.
		 */
		FractionEquation equi = new FractionEquation (1, -10);
		equi.of(10);
	}
	
	
	//Check tostring
	@Test
	public void testToString () {
		/**
		 * Test method for {@link uk.ac.york.modules.testing.FractionEquation#toString}.
		 */
		FractionEquation equi = new FractionEquation (1, 1);
		equi.toString();
	}

}
