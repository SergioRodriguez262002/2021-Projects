package rodriguezProject2;

import java.io.*;
import java.util.*;
import edu.du.dudraw.*;

public class RodriguezProject2 {

	public static void main(String[] args) {
		int width, height;
		height = 400;
		width = (int) (height * (1 + Math.sqrt(5)) / 2);

		DUDraw.setCanvasSize(width, height);
		DUDraw.setXscale(0, width);
		DUDraw.setYscale(0, height);

		File file;
		Scanner reader;

		try {
			file = new File("Emoji.txt");
			reader = new Scanner(file);
			int rows = reader.nextInt();
			int cols = reader.nextInt();

			String type;
			int hour;

			int x, y;

			Emoji[] emoji = new Emoji[rows * cols];

			int count = 0;
			for (int row = 0; row < rows; row++) {
				for (int col = 0; col < cols; col++) {
					type = reader.next();

					x = 50 + col * 100;
					y = 50 + row * 100;

					if (type.equals("clock")) {
						hour = reader.nextInt();
						emoji[count] = new ClockEmoji(x, y, hour);
					} else if (type.equals("smile")) {
						emoji[count] = new SmileyFaceEmoji(x, y);
					} else {
						emoji[count] = new SurprisedFaceEmoji(x, y);
					}

					emoji[count].draw();

					count += 1;
				}
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}

	}

}
