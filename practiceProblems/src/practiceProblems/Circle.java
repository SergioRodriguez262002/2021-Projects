package practiceProblems;

import java.awt.Color;

public class Circle extends Shape {
	private double radius;
	
	public Circle(double x, double y, Color c, double r) {
		super(x,y,c);
		radius = r;
	}
	
	public Circle(Circle other) {
		super(other);
		if(other != null) {
			this.radius = other.radius;
		}
		
	}

}
