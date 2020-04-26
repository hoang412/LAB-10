package application;
//task 2
/**
 * This function goes to 0 at x = 1 or x = 3
 * 
 *
 */
public class Function4 extends Function{

	@Override
	public double fnValue(double x) {
		return Math.pow(x,3) - (7*Math.pow(x,2)) + 15*x - 9;
		
	}

	public String toString() {
		return "x^3 - 7*x^2 + 15*x - 9";
	}
}
