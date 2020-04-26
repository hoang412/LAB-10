package application;
/*
 * At x approach 0. The function will go faster and faster 
 * The limit does not exist at 0 because The closer x gets to 0,
 * the faster the function oscillates between 1 and -1.
 */
public class Function5 extends Function {

	@Override
	public double fnValue(double x) {
		
		return Math.sin(1/x);
	}
	
	public String toString() {
		return "sin(1/x)";
	}

}
