package rodriguezSandGame;

import java.awt.Color;
import java.util.*;
import edu.du.dudraw.*;

public class SandWorld {
	private int[][] world;
	private int fallSpeed = 1;
	Color sandColor = new Color(194, 178, 128);
	Color floorColor = new Color(0, 0, 0);
	Color waterColor = DUDraw.BLUE;

	public SandWorld(int width, int height) { // The constructor creates the array that stores the value of every pixel
												// on the canvas screen and sets the default value to 0. Zero is empty
												// space. The parameters are the width and height of the screen and
												// determine the width and height of the array
		world = new int[height][width];
		for (int row = 0; row < world.length; row++) {
			for (int column = 0; column < world[row].length; column++) {
				world[row][column] = 0;
			}
		}

	}

	public boolean placeParticle(int row, int col, int newType) {
		int sprinkleDiameter = 14;
		int xRand = col - (sprinkleDiameter / 2) + (int) (Math.random() * sprinkleDiameter);
		int yRand = row - (sprinkleDiameter / 2) + (int) (Math.random() * sprinkleDiameter);
		// the lines above generate random x and y coordinates around the center of the
		// mouse position parameters according to a diameter

		if (newType == 1 || newType == 3) {
			if (xRand <= 0) { // If the random x position is randomized to be less or equal to 0 then its
				// reset to 1. If the random x position is larger than the width of the screen
				// then the x position is reset to the width of the array -1
				xRand = 1;
			} else if (xRand >= world[0].length) {
				xRand = world[0].length - 1;
			}

			if (yRand <= 0) { // If the random y position is randomized to be less or equal to 0 then its
								// reset to 1. If the random y position is larger than the height of the screen
								// then the y position is reset to the width of the array -1
				yRand = 1;
			} else if (yRand >= world.length) {
				yRand = world.length - 1;
			}

			if (world[yRand][xRand] == 0) { // If the random position on the world array is empty then the set position
											// is
				// set to whatever the particle type is. If the cell in the world array is empty
				// then the function also return true, else the function returns false and
				// nothing is placed
				world[yRand][xRand] = newType;
			} else {
				return false;
			}
		}

		if (newType == 2) {
			for (int i = -2; i < 2; i++) {
				for (int j = -2; j < 2; j++) {
					world[row + i][col + j] = newType;
				}
			}

		} else {
			return false;
		}

		return true;

	}

	public void step() {
		// The following for loop loops through the world array and draws the particle
		// on screen according to the rows and columns of the array set to y and x. If
		// the element in the current array is 1 then then a sand particle is drawn.
		for (int rows = 0; rows < world.length; rows++) {
			for (int cols = 0; cols < world[0].length; cols++) {
				if (world[cols][rows] == 1) {
					DUDraw.setPenColor(sandColor);
					DUDraw.square(rows, cols, 1);
				}
				if (world[cols][rows] == 2) {
					DUDraw.setPenColor(floorColor);
					DUDraw.square(rows, cols, 1);
				}

				if (world[cols][rows] == 3) {
					DUDraw.setPenColor(waterColor);
					DUDraw.square(rows, cols, 1);
				}

			}
		}

		// The following for loop moves the sand down the canvas. If there's an sand
		// array cell and if there is a empty array cell a row below then the row bellow
		// is set to a sand particle and the current element is set to empty space. This
		// allows for the sand to fall and pile up on the bottom of the screen.

		for (int row = 2; row < world.length - 2; row++) {
			for (int column = 2; column < world[row].length - 2; column++) {

				boolean emptyBellow = (world[row - 1][column] == 0 && world[row][column] == 1);

				boolean barrier = world[row][column] == 1 && row - 1 == 0 || world[row][column] == 1 && row - 1 == 2;

				boolean flowLeft = world[row][column] == 1 && world[row - 1][column - 1] == 0
						&& world[row - 1][column] == 1;

				boolean flowRight = world[row][column] == 1 && world[row - 1][column + 1] == 0
						&& world[row - 1][column] == 1;

				if (emptyBellow) {
					world[row - fallSpeed][column] = 1;
					world[row][column] = 0;
				}

				if (flowLeft && !barrier) {
					// System.out.println("Bottom screen");
					world[row][column] = 0;
					world[row - 1][column - 1] = 1;
				}

				if (flowRight && !barrier) {
					world[row][column] = 0;
					world[row - 1][column + 1] = 1;
				}

				// Water physics
				if (world[row][column] == 3) { // The following code is for the water physics.
					boolean emptyBelowWater = (world[row - 1][column] == 0 && world[row][column] == 3);
					boolean moveLeft = world[row][column - 1] == 0 && world[row - 1][column] != 0;
					boolean moveRight = world[row][column + 1] == 0 && world[row - 1][column] != 0;
					boolean levelWater = world[row][column - 1] == 3 && world[row][column + 1] == 3;

					if (emptyBelowWater) { // If there's an empty cell below the water then the water falls one cell.
						world[row - 1][column] = 3;
						world[row][column] = 0;
					}

					if (moveLeft && moveRight) { // if a water particle hits something below and the there is an empty
													// cell to either side then randomly move the water cell to the left
													// or right one cell
						if (Math.random() > 0.93) {
							world[row][column - 1] = 3;
							world[row][column] = 0;
						} else {
							world[row][column + 1] = 3;
							world[row][column] = 0;
						}
					} else {
						if (Math.random() > 0.93) { // There a chance that the code checks if there is an empty cell on
													// either side of the water particle. If the left is empty move one
													// cell to the left vice verse. This is meant to activate the water
													// below conditional where if a cell bellow is empty the particle
													// just falls. Like this water physics can be simulated.
							if (moveLeft) {
								world[row][column - 1] = 3;
								world[row][column] = 0;
							} else if (moveRight) {
								world[row][column + 1] = 3;
								world[row][column] = 0;
							}
						} else {
							if (moveRight) {
								world[row][column + 1] = 3;
								world[row][column] = 0;
							} else if (moveLeft) {
								world[row][column - 1] = 3;
								world[row][column] = 0;
							}
						}
					}

				}

			}
		}

	}

	public void rain() { // Rain physics. Simply generates water cells at random empty points in space.
		int xRand = (int) (Math.random() * world[0].length);
		int yRand = (int) (Math.random() * world.length);

		if (world[yRand][xRand] == 0) {
			world[world.length - 1][xRand] = 3;
		}

	}

}
