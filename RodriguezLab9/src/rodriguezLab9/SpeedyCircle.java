package rodriguezLab9;

import edu.du.dudraw.DUDraw;

public class SpeedyCircle extends NormalCircle{
	
	public SpeedyCircle(double r) {
		super(r);
		super.setColor(DUDraw.GREEN);
	}
	
	@Override
	public void bounce() {
		if(xPos  >= 1) {
			xVel *= -1.05;
			yVel *= 1.05;
		}
		if(xPos <= 0) {
			xVel *= -1.05;
			yVel *= 1.05;
		}
		
		if(yPos  >= 1) {
			yVel *= -1.05;
			xVel *= 1.05;
		}
		if(yPos <= 0) {
			yVel *= -1.05;
			xVel *= 1.05;
		}
		
	}
	
	public void move() {
		bounce();
		super.foward();
	}
}
