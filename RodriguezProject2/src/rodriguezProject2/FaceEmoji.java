package rodriguezProject2;
import edu.du.dudraw.*;

public abstract class FaceEmoji extends Emoji {
	private int eyeRadius = 10;
	
	public FaceEmoji(int x, int y) {
		super(x, y);
	}
	
	public void draw() {
		// Head of Emoji
		DUDraw.circle(super.xPos, super.yPos, super.size);
		DUDraw.setPenColor(DUDraw.YELLOW);
		DUDraw.filledCircle(super.xPos, super.yPos, super.size);
		// Eyes of Emoji
		DUDraw.setPenColor(DUDraw.BLACK);
		DUDraw.filledCircle(super.xPos - 20, super.yPos + 15, eyeRadius);
		DUDraw.filledCircle(super.xPos + 20, super.yPos + 15, eyeRadius);
	}

}
