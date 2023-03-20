package rodriguezLab12;

import java.util.Scanner;

import edu.du.dudraw.DUDraw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.awt.*;
import java.io.RandomAccessFile;

public class RodriguezLab12 {

	public static void main(String[] args) {
		// TODO: Find out the name of the file from the user
		Scanner userInput = new Scanner(System.in);
		String fileName;
		do {
			System.out.println("Please enter the name of the file you'd like to open.");
			fileName = userInput.next();

			if (!fileName.equals(fileName)) {
				System.out.println("error");
			}
		} while (!fileName.equals(fileName));

		// TODO: Declare a 2D array of Color objects
		// (don't instantiate it here, as must wait until we know the size of the image)
		Color[][] colors = null;

		// TODO: in a try/catch block, call your BMPIO's readBMPfile() method, passing
		// it the file name
		try {
			colors = BMPIO.readBMPfile(fileName);
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			// System.exit(0);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		// Note that the method should return a reference to an array, so store that
		// reference in your array variable

		// TODO: if the array of Color objects that was returned is not null, then
		// output the array to a DUDraw canvas
		// If the returned array is null, it means the reading of the file failed.
		// Output an error message
		
		DUDraw.setCanvasSize(colors[0].length, colors.length);
		
		DUDraw.setXscale(0,colors[0].length);
		DUDraw.setYscale(0,colors.length);
		
		DUDraw.enableDoubleBuffering();

		if (colors != null) {
			for (int row = 0; row < colors.length; row++) {
				for (int col = 0; col < colors[0].length; col++) {
					DUDraw.setPenColor(colors[row][col]);
					DUDraw.point(col, row);
				}
			}
		}
		
		DUDraw.show();

	}

}
