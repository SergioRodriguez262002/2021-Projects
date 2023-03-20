/*Author; Sergio Rodriguez
 * Part one of the sand project. The sand sprinkles and piles up on the bottom of the canvas*/
package rodriguezSandGame;

import edu.du.dudraw.*;
import java.awt.*;

public class SandGame {

	public static void main(String[] args) {
		// Setting up the screen
		int width = 300;
		DUDraw.setCanvasSize(width, width);
		DUDraw.setXscale(0, width);
		DUDraw.setYscale(0, width);
		Color skyBlue = new Color(204, 248, 255); // Back ground color
		SandWorld world = new SandWorld(500, 500); // Creating the sand world object
		int particleType = 1;

		// Text display set up
		Font font = new Font("Arial", Font.BOLD, 20);
		DUDraw.setFont(font);
		String[] particleTypeDisplay = { "", "SAND", "FLOOR", "WATER" }; // The array displays the particle type
																			// according to the particle type around
																			// line 58 

		DUDraw.enableDoubleBuffering();
		while (true) {
			DUDraw.clear(skyBlue);
			world.step();
			world.rain();
			if (DUDraw.isMousePressed()) { // When the mouse if pressed it places sand particles where the mouse is
											// located on the canvas
				int xPos, yPos;
				xPos = (int) (DUDraw.mouseX());
				yPos = (int) (DUDraw.mouseY());
				world.placeParticle(yPos, xPos, particleType); // The sand is placed
			}

			if (DUDraw.hasNextKeyTyped()) { // The controls will move the ship up down left right mapped to WASD. The
				// move method of the ship class will adjust the x and y position according
				// to the parameters inputed
				char control = DUDraw.nextKeyTyped();
				if (control == 'f' || control == 'F') {
					particleType = 2;
				}
				if (control == 's' || control == 'S') {
					particleType = 1;
				}
				if (control == 'w' || control == 'W') {
					particleType = 3;
				}

			}

			// Display particle type on the top right corner
			DUDraw.setPenColor(DUDraw.WHITE);
			DUDraw.filledRectangle(width / 6, 280, 50, 20);
			DUDraw.setPenColor(DUDraw.BLACK);
			DUDraw.text(width / 6, 280, particleTypeDisplay[particleType]); //

			DUDraw.pause(0);
			DUDraw.show();
		}

	}

}
