package rodriguezProject2;

import edu.du.dudraw.*;

public abstract class Emoji {
	// Protected data storing the location and size
	protected int xPos, yPos;
	protected static int size = 50;

	// Constructor sets the position
	public Emoji(int x, int y) {
		xPos = x;
		yPos = y;

	}

	// Abstract draw
	public abstract void draw();

}
