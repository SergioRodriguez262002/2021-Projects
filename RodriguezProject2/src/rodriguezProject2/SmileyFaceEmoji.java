package rodriguezProject2;

import edu.du.dudraw.DUDraw;

public class SmileyFaceEmoji extends FaceEmoji {

	public SmileyFaceEmoji(int x, int y) {
		super(x, y);
	}
	
	public void draw() {
		// This inherited method draws the head and eyes
		super.draw();
		DUDraw.setPenColor(DUDraw.BLACK);
		DUDraw.arc(xPos, yPos, size - 25, 200, -20);
	}

}
