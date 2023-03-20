package rodriguezLab9;

import java.awt.*;

import edu.du.dudraw.DUDraw;

public abstract class MovingCircle {

	protected double xPos;
	protected double yPos;
	protected double xVel;
	protected double yVel;
	private Color color;
	protected double radius;

	// Constructor, initialize radius
	public MovingCircle(double r) {
		radius = r;
		xPos = Math.random();
		yPos = Math.random();
		xVel = ((Math.random() * (0.02)) - 0.01);
		yVel = ((Math.random() * (0.02)) - 0.01);
	}

	public abstract void move();

	public void draw() {
		DUDraw.setPenColor(color);
		DUDraw.filledCircle(xPos, yPos, radius);

	}

	// Move x and y foward according to velocty 
	public void foward() {
		xPos += xVel;
		yPos += yVel;

	}
	
	public void bounce() {
		if(xPos + radius > 1) {
			xVel *= -1;
		}
		if(xPos - radius < 0) {
			xVel *= -1;
		}
		
		if(yPos + radius> 1) {
			yVel *= -1;
		}
		if(yPos - radius < 0) {
			yVel *= -1;
		}
		
	}
	
	public void setColor(Color c) {
		color = c;
	}

}
