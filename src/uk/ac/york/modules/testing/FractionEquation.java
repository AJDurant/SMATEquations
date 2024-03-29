/**
 * 
 */
package uk.ac.york.modules.testing;

/**
 * This class represents an equation of the type f(x) = a/(x+b).
 * 
 * @author Manuel Oriol (manuel@cs.york.ac.uk)
 * @date Feb 14, 2010
 *
 */
public class FractionEquation extends Equation {

	/**
	 * a in a/(x+b).
	 */
	double a;
	
	/**
	 * b in a/(x+b).
	 */
	double b;
	/**
	 * 
	 */
	public FractionEquation(double a, double b) throws IllegalArgumentException {
		this.a = a;
		this.b = b;
                if (b<=0)
                {
                	IllegalArgumentException e = new IllegalArgumentException("b<=0");
                    throw e;
                }
	
	}
	@Override
	public double of(double x) {
		return a/(x+b);
	}
	@Override
	public String toString() {
		return a+"/(x+"+b+")";
	}

}
