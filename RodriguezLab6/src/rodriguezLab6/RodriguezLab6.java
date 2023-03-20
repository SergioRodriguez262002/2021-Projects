package rodriguezLab6;

import java.io.*;
import java.util.*;

public class RodriguezLab6 {

	public static void main(String[] args) {
		// Open the file for read access. Read 100 integers, outputting
				// them to the console. Output a newline every 20 characters
				try {
					// Here is an example of how to use an anonymous object instead of
					// creating a variable to store the File object.
					// Also: any time you create a RandomAccessFile object or use it
					// invoke a method on it, that must be in a try/catch block
					RandomAccessFile inputStream = new RandomAccessFile(new File("Randomints1.dat"), "r");
					for (int i = 1; i <= 100; i++) {
						System.out.print(inputStream.readInt() + " ");
						if (i % 20 == 0) {
							System.out.print("\n");
						}
					}
					System.out.print("\n");
					inputStream.close();
				} catch (IOException e) {
					System.out.println("IO failure: ");
					System.out.println(e.getMessage());
				}

	}

}
