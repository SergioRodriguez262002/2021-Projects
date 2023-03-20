package rodriguezLab16;

import edu.du.dudraw.*;

public class Recursion {

	public Recursion() {
		

	}

	public static int sumOfSquares(int k) {

		if (k == 0) {
			return 0;
		}

		return sumOfSquares(k - 1) + (k * k);

	}

	public static int fib(int n) {
		
		if(n == 0) {
	        return 0;
		}
	    else if(n == 1) {
	      return 1;
	    }

		return fib(n - 1) + fib(n - 2);
	}
	
	
	public static void drawCircles(double x, double y, double radius, int n) {
		
		if(n == 0) {
			return;
		}
		
		DUDraw.circle(x, y, radius);
		drawCircles(x+radius, y, (radius/2), n-1);
		
	}

}
