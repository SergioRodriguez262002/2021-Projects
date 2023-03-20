package rodriguezProject2;

import edu.du.dudraw.DUDraw;

public class SurprisedFaceEmoji extends FaceEmoji {
	public SurprisedFaceEmoji(int x, int y) {
		super(x,y);
	}
	
	public void draw() {
		// This inherited method draws the head and eyes
		super.draw();
		// Drawing the smile
		DUDraw.setPenColor(DUDraw.BLACK);
		DUDraw.filledCircle(xPos, yPos - 20, 10);
	}

}
