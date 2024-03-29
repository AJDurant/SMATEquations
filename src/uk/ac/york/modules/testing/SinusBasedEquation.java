/**
 * 
 */
package uk.ac.york.modules.testing;

/**
 * This class represents a*sin(b*x)^c+d
 * 
 * @author Manuel Oriol (manuel@cs.york.ac.uk)
 * @date Feb 15, 2010
 *
 */
public class SinusBasedEquation extends Equation {
	/**
	 * a in a*sin(b*x^c)+d.
	 */
	double a;
	
	/**
	 * b in a*sin(b*x^c)+d.
	 */
	double b;

	/**
	 * c in a*sin(b*x^c)+d.
	 */
	double c;

	/**
	 * d in a*sin(b*x^c)+d.
	 */
	double d;

	/**
	 * Constructor for sinus-based equations.
	 */
	public SinusBasedEquation(double a, double b, double c, double d) throws IllegalArgumentException {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		IllegalArgumentException e = new IllegalArgumentException();
                
                //Check border cases
                if (
                        b == Double.MAX_VALUE || 
                        (c == Double.POSITIVE_INFINITY && b == Math.PI/2)  
                        || (b == 1 && c<0)
                    )
                {
                    throw new IllegalArgumentException("Value not allowed");
                }
                
                //Check that computation is actually feasible to compute.
                //Power of 30 should be high enough to stump most graphing softwares.
                if (c>30) { throw new IllegalArgumentException("Power to high, only accept powers <= 30"); }
	
	}
	@Override
	public double of(double x) {
		return a * Math.sin(Math.pow(b*x,c)) + d;
	}
	@Override
	public String toString() {
		return a+"(sin("+b+"x^"+c+"))"+(d>0?"+":"")+d;
	}
}
