package practiceExercises4;

import java.util.*;

public class PracticeExercises4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] testArr = new double[(int) (Math.random() * 10)];

		System.out.print("Random nums ");

		for (int i = 0; i < testArr.length; i++) {
			testArr[i] = (Math.random() * 7) - 5;
			System.out.print(testArr[i] + " ");
		}

		secondLargestElement(testArr);

		double[] same = { 1, 1, 1, 1, 1, 1, 1 };
		secondLargestElement(same);
		
		ArrayList<Boolean> dubs = new ArrayList<Boolean>();
		
		
		

	}
	
	
	
	
	public boolean equals(Object other) {
		if (other == null || other.getClass() != this.getClass()) {
			return false;
		} else {
			Circle otherCircle = (Circle) other;
			return super.equals(other) && this.radius == otherCircle.radius;
		}
	}
	
	public boolean equals(Object other) {
		if (other == null || other.getClass() != this.getClass()) {
			return false;
		} else {
			Shape otherShape = (Shape) other;
			return  otherShape.xCenter == this.xCenter && otherShape.yCenter == this.yCenter && this.color.equals(otherShape.color);
		}
	}
	
	public Shape(Shape otherShape) {
		if (otherShape != null) {
			this.xCenter = otherShape.xCenter;
			this.yCenter = otherShape.yCenter;
			this.color = otherShape.color;
		}
	}

	public Circle(Object other) {
		if (other == null || other.getClass() != this.getClass()) {
			return false;
		}
		
		super(other);
		Circle otherCircle = (Circle) other;
		
		this.radius = otherCicle.radius;
	}
	
	
	

	public static double secondLargestElement(double arr[]) {
		double secondLargest = 0;
		double firstLargest;
		if (arr.equals(null) || arr.length == 0) { // if the parameter double array is null or of length zero then
													// return zero. I don't know what else to return apart from zero
													// returning null doesn't seem to work
			return 0;
		}

		if (arr.length == 1) { // If the array is of length 1 then the second largest number is just the lone
								// element in the array
			return arr[0];
		}

		firstLargest = arr[0]; // First largest baseline value is the first element of the parameter array.
		secondLargest = arr[1]; // The second largest baseline values is the second element of the parameter
								// array.

		for (int i = 1; i < arr.length; i++) { // This loops through each element in the array - the first and checks if
												// the current is larger than the first largest.
			if (arr[i] > firstLargest) { // If the current element is larger than the first largest element then, the
											// second largest element is now the first largest element var. the first
											// largest element var is now the current element of the array
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}
		} // If the array is all of one value then the second largest element will be the value. 
		

		return secondLargest;

	}

	public static double[] swap(double arr[]) {
		double[] newArr = new double[arr.length];
		double smallest = arr[0];
		int index = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
				index = i;
			}

			newArr[i] = arr[i];
		}

		newArr[index] = arr[0];
		newArr[0] = smallest;

		return newArr;

	}

}
