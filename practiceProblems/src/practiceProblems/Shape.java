package practiceProblems;

import java.awt.Color;

public class Shape {
	private double xCenter;
	private double yCenter;
	private Color color;
	
	public Shape(double x, double y, Color c)
	{
		this.xCenter = x;
		this.yCenter = y;
		this.color = c;
	}
	
	// copy constructor:
	public Shape(Shape otherShape) {
		if (otherShape != null) {
			this.xCenter = otherShape.xCenter;
			this.yCenter = otherShape.yCenter;
			this.color = otherShape.color;
		}
	}

}