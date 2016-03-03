package uk.ac.york.modules.testing;

public class SecondOrderEquation extends Equation {

	/**
	 * a in a*x^2+bx+c.
	 */
	double a;
	
	/**
	 * b in a*x^2+bx+c.
	 */
	double b;

	/**
	 * c in a*x^2+bx+c.
	 */
	double c;

	/**
	 * Constructor for second order equations.
	 */
	public SecondOrderEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	
	}
	@Override
	public double of(double x) {
		return a * Math.pow(x, 2) + b * x + c;
	}
	@Override
	public String toString() {
		return a+"x^2+"+b+"x+"+c;
	}
}
