package PracticeExercises1;

public class Point {
	private double xLocation;
	private double yLocation;

	// constructor for initializing the location of the point
	public Point(double x, double y) {
		this.xLocation = x;
		this.yLocation = y;
	}

	// format the output as (x, y)
	public String toString() {
		return "(" + this.xLocation + ", " + this.yLocation + ")";
	}

	// Method that returns the distance between two point objects
	public static double distance(Point point1, Point point2) {
    	double x = Math.pow(point2.xLocation - point1.xLocation, 2);
    	double y = Math.pow(point2.yLocation - point1.yLocation, 2);
    	return Math.sqrt(x+y);
    }
}
