/**
 * 
 */
package uk.ac.york.modules.testing;

import static org.junit.Assert.*;

import java.awt.HeadlessException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * This class provides some tests for the Equations program.
 * 
 * @author Rob Alexander (rob.alexander@york.ac.uk)
 * @date Feb 26, 2013
 *
 */
public class TestEquationsView{

	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	/**
	 * Test method for {@link uk.ac.york.modules.testing.EquationsView#main(java.lang.String[])}.
	 */
	@Test
	public final void testMain() {
		String []arguments = {"Help"};
		try{
			EquationsView.main(arguments);
		}catch(Exception e){
			fail();
		}
	}

	
	@Test
	public final void testMainWithTwoArguments() {
		String []arguments = {"Help", "AnotherArgument"};
		
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Incorrect Number of arguments");
		
		EquationsView.main(arguments);
		
	}
	
	@Test
	public final void testMainFirstOrder() {
		String []arguments = {"FirstOrder"};
		try {
			EquationsView.main(arguments);
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public final void testMainFraction() {
		String []arguments = {"Fraction"};
		try {
			EquationsView.main(arguments);
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public final void testMainSinus() {
		String []arguments = {"Sinus"};
		try {
			EquationsView.main(arguments);
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public final void testMainSecondOrder() {
		String []arguments = {"SecondOrder"};
		try {
			EquationsView.main(arguments);
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	public final void testMainNotAnArgument() {
		String []arguments = {"NotAnArgument"};
		
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("Not defined command");
		
		EquationsView.main(arguments);
	}
	
	@Test
	public final void testHeadless() throws HeadlessException {		
		thrown.expect(HeadlessException.class);
		EquationsView view = new EquationsView();
	}
	
	/**
	 * Test method for {@link uk.ac.york.modules.testing.EquationsView#increment(int)}.
	 */
	@Test
	public final void testIncrement() {
		assertEquals(1, EquationsView.increment(0));
	}

	/**
	 * Test method for {@link uk.ac.york.modules.testing.EquationsView#increment(int)}.
	 */
	@Test
	public final void testIncrement2() {
		assertTrue(EquationsView.increment(Integer.MAX_VALUE)<0);
	}
	
	
	

}
