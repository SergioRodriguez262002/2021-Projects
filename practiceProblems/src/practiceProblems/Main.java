package practiceProblems;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		
	}

}




/*try {

			RandomAccessFile file = new RandomAccessFile("test1.dat", "r");

			short totalCol = file.readShort();

			System.out.println("Columns " + totalCol);

			short totalRow = file.readShort();

			System.out.println("Rows " + totalRow);

			short data;

			short[][] arr = new short[totalRow][totalCol];

			int zeroOnlyRow = 0;

			for (int row = 0; row < totalRow; row++) {
				for (int col = 0; col < totalCol; col++) {
					arr[row][col] = file.readShort();
				}
			}

			// Check number of zeros in last row

			int zeroCounter = 0;

			for (int col = 0; col < totalCol; col++) {
				if (arr[arr.length - 1][col] == 0) {
					zeroCounter += 1;
				}

			}

			System.out.println("Number of 0 in the last row " + zeroCounter);

			// Check zero only collumns

			boolean notZero = false;
			int zeroColumn = 0;

			for (int col = 0; col < totalCol; col++) {
				for (int row = 0; row < totalRow; row++) {
					if (arr[row][col] != 0) {
						notZero = true;
					}
				}
				if (!notZero) {
					zeroColumn += 1;
				}
				notZero = false;
			}

			System.out.println("Number of zero only columns " + zeroColumn);

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
*/