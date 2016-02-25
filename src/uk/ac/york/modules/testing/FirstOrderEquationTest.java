package uk.ac.york.modules.testing;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class FirstOrderEquationTest {
	
	private FirstOrderEquation simpleLinear;
	private FirstOrderEquation straightLine;
	private FirstOrderEquation throughOrigin;
	private FirstOrderEquation fractional;
	private FirstOrderEquation nastyfractional;
	private FirstOrderEquation negative;

	@Before
	public void setUp() throws Exception {
		simpleLinear = new FirstOrderEquation(2, 5);
		straightLine = new FirstOrderEquation(0, 2);
		throughOrigin = new FirstOrderEquation(1, 0);
		negative = new FirstOrderEquation(-1, -2);
		fractional = new FirstOrderEquation(0.02, -5.2);
		nastyfractional = new FirstOrderEquation(-0.43215124, -34.532162);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testToString() {
		// test simple
		assertEquals("2.0x+5.0", simpleLinear.toString());
		assertEquals("0.0x+2.0", straightLine.toString());
		assertEquals("1.0x+0.0", throughOrigin.toString());
		assertEquals("-1.0x-2.0", negative.toString());
		assertEquals("0.02x-5.2", fractional.toString());
		assertEquals("-0.43215124x-34.532162", nastyfractional.toString());
	}

	@Test
	public void testOf() {
		assertEquals(-6.0, negative.of(1), 5);
		assertEquals(2, straightLine.of(5), 5);
		assertEquals(-5.1, fractional.of(5), 5);
	}
	
	
}
