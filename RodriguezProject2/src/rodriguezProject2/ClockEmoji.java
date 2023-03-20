package rodriguezProject2;

import edu.du.dudraw.DUDraw;

public class ClockEmoji extends Emoji {
	private int hour;

	public ClockEmoji(int x, int y, int h) {
		super(x, y);
		hour = h;
	}

	public void draw() {
		// Drawing the clock face 
		DUDraw.setPenColor(DUDraw.BLACK);
		DUDraw.circle(xPos, yPos, size);

		// Drawing the hour hand according to the unit circle and the hour var passed.
		double length = size;
		double time = (Math.PI/2) - (2 * Math.PI / 12) * hour;

		DUDraw.line(xPos, yPos, xPos + length * Math.cos(time), yPos + length * Math.sin(time));
	}

}
