package rodriguezLab17;

import edu.du.dudraw.DUDraw;

public class RecursiveDrawings {
	public RecursiveDrawings() {

	}

	public static void drawCircles(double x, double y, double radius, int n) {

		if (n == 0) {
			return;
		}

		DUDraw.circle(x, y, radius);
		drawCircles(x + radius, y, (radius / 2), n - 1);
	}

	public static void drawTreeRecursive(int n, double x, double y, double length, double angle) {
		if (n == 0) {
			return;
		}
		// Draw lines cos, sin
		int xPosAngle = (int) (length * Math.cos(angle * Math.PI / 180));
		int yPosAngle = (int) (length * Math.sin(angle * Math.PI / 180));

		DUDraw.line(x, y, x + xPosAngle, y + yPosAngle);
		drawTreeRecursive(n - 1, x + xPosAngle, y + yPosAngle, length / 1.5, angle + 45);
		drawTreeRecursive(n - 1, x + xPosAngle, y + yPosAngle, length / 1.5, angle - 45);
	}

	public static void mondrian(double left, double right, double bottom, double top) {

		// mondrian();

	}
}
