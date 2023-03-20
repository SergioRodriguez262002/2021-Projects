package rodriguezLab16;

import edu.du.dudraw.DUDraw;

public class RecursionDriver {

	public static void main(String[] args) {

		// Sum of squres

		for (int i = 0; i <= 10; i++) {
			System.out.println("sumOfSquares(" + i + ") = " + Recursion.sumOfSquares(i));
		}

		for (int i = 0; i <= 10; i++) {
			System.out.println("fib(" + i + ") = " + Recursion.fib(i));
		}
		DUDraw.enableDoubleBuffering();
		DUDraw.setCanvasSize(500,500);
		DUDraw.setXscale(0,500);
		DUDraw.setYscale(0,500);
	
		
		Recursion.drawCircles(200, 250, 100, 50);
		DUDraw.show();
	}

}
