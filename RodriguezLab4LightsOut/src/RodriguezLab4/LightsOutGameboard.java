package RodriguezLab4;
import edu.du.dudraw.*;

public class LightsOutGameboard {
	private LightsOutWindow[][] board;

	// Constructor, two integer arguments give the number of rows and column in the
	// board
	// each lights are initialized to on or off randomly (equal chances of
	public LightsOutGameboard(int r, int c) {
		// Create a new gameboard
		// fill board with windows. lights are initialized on/off randomly with equal
		// likelihood
		board = new LightsOutWindow[r][c];
		for (int row = 0; row < r; row++) {
			for (int column = 0; column < c; column++) {
				board[row][column] = new LightsOutWindow(Math.random() > 0.5, row, column);
			}
		}
		// Initialize DUDraw
		DUDraw.setCanvasSize(500, 500);
		// Note: the number of columns determines the width in the x-direction
		// while the number of rows determines the with in the y-direction
		DUDraw.setXscale(0, c);
		DUDraw.setYscale(0, r);
	}

	public void draw() {
		// Draw all windows in the 2D array. Note that this.board.length is the number
		// of rows
		// while this.board[0].length is the number of columns
		for (int row = 0; row < this.board.length; row++) {
			for (int col = 0; col < this.board[0].length; col++) {
				DUDraw.setPenColor(this.board[row][col].isLightOn() ? DUDraw.YELLOW : DUDraw.BLACK);
				DUDraw.filledRectangle(row + 0.5, col + 0.5, 0.5, 0.5);
			}
		}
		// Draw the lines between the windows:
		DUDraw.setPenColor(DUDraw.GRAY);
		DUDraw.setPenRadius(2);
		// Draw the vertical lines, including ones at the left and right edge
		for (int col = 0; col < this.board[0].length; col++) {
			DUDraw.line(col, 0, col, this.board[0].length);
		}
		// Draw the horizontal lines, including ones at the top and bottom
		for (int row = 0; row < this.board.length; row++) {
			DUDraw.line(0, row, this.board.length, row);
		}

	}

	/*
	 * This method should be called when a mouse is clicked on a window. It changes
	 * the states of the light at that position and all neighboring lights (above,
	 * below, left and right). xPos and yPos give the position on the screen of the
	 * mouse click. Because of how we have set up the scale, we can turn the mouse
	 * position into row and column indices just by casting (rounding down) to an
	 * integer. Once we know the position, we toggle the state of the light (turn it
	 * off if it is on and turn it on if it is off), and also toggle the states of
	 * each neighbor above, below, left and right
	 */
	public void clickLight(double xPos, double yPos) {
		int r, c;
		c = (int) xPos;
		r = (int) yPos;
		// toggle this light:
		board[r][c].toggle();
		// toggle the light below:
		if (r - 1 >= 0) {
			board[r - 1][c].toggle();
		}
		// toggle the light above:
		if( r + 1 < board.length) { //
			board[r + 1][c].toggle();
		}
		// toggle the light to the left:
		if (c - 1 >= 0) {
			board[r][c - 1].toggle();
		}
		// toggle the light to the right:
		if( c + 1 < board[0].length) { //
			board[r][c + 1].toggle();
		}

		

	}

	// Oops, I didn't write this method yet. You'll have to implement this method!
	public boolean allOn() {
		return false;
	}

	// Oops, I didn't write this method yet. You'll have to implement this method!
	public boolean allOff() {
		return false;
	}

	// This method is not used in the final code. It's just provided to help with
	// debugging.
	// Notice that since row 1 is at the bottom, I need to draw the last row first.
	// This method has been debugged.
	public void drawToConsole() {
		for (int i = 0; i < this.board[0].length; i++)
			System.out.print("--");
		System.out.println("---");
		for (int i = this.board.length - 1; i >= 0; i--) {
			System.out.print("| ");
			for (int j = 0; j < this.board[0].length; j++) {
				if (board[i][j].isLightOn())
					System.out.print("O ");
				else
					System.out.print("X ");
			}
			System.out.println("|");
		}
		for (int i = 0; i < this.board[0].length; i++)
			System.out.print("--");
		System.out.println("---");
	}
	

}
