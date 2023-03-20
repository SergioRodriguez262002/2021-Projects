package rodriguezProject3;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import edu.du.dudraw.DUDraw;

public class RodriguezProject3 {

	public static void main(String[] args) {

		while (true) {
			Scanner keyboard = new Scanner(System.in);
			String menuOption;
			do {

				System.out.println("Type A to extract image, type B to embed an image");
				menuOption = keyboard.next();
				menuOption.replaceAll("\\s", "");

				if (!menuOption.equals("A") && !menuOption.equals("B")) {
					System.out.println("Invalid option");
				} else {
					break;
				}

			} while (true);

			Steganography steg = new Steganography();

			if (menuOption.equals("A")) {
				do {
					System.out.println("Enter the file path of the embeded image: ");
					String fileName = keyboard.next();
					try {
						Color[][] Image = BMPIO.readBMPfile(fileName);

						Color[][] og = BMPIO.readBMPfile(fileName);

						Image = steg.extractSecretImage(Image);

						displayImage(og, Image);

						break;
					} catch (FileNotFoundException e) {
						System.out.println(e.getMessage());
					} catch (IOException e) {
						System.out.println(e.getMessage());
					} catch (BMPIOException e) {
						System.out.println(e.getMessage());
					}
				} while (true);
			} else {
				Color[][] publicImageColors = null;
				Color[][] privateImageColors = null;
				String publicImageFile;
				do {
					try {
						System.out.println("Enter the file path of the public image: ");
						publicImageFile = keyboard.next();
						publicImageColors = BMPIO.readBMPfile(publicImageFile);
						break;
					} catch (FileNotFoundException e) {
						System.out.println(e.getMessage());
					} catch (IOException e) {
						System.out.println(e.getMessage());
					} catch (BMPIOException e) {
						System.out.println(e.getMessage());
					}
				} while (true);

				do {
					try {
						System.out.println("Enter the file path of the private image: ");
						String privateImageFile = keyboard.next();
						privateImageColors = BMPIO.readBMPfile(privateImageFile);
						break;
					} catch (FileNotFoundException e) {
						System.out.println(e.getMessage());
					} catch (IOException e) {
						System.out.println(e.getMessage());
					} catch (BMPIOException e) {
						System.out.println(e.getMessage());
					}
				} while (true);

				Color[][] embededImage = steg.embedSecretImage(publicImageColors, privateImageColors);

				displayImage(publicImageColors, embededImage);

				try {
					String newModFile = publicImageFile.substring(0, publicImageFile.length() - 4);
					System.out.println(newModFile);
					BMPIO.writeBMPCopy(publicImageFile, newModFile + "Embeded.bmp", embededImage);

				} catch (FileNotFoundException e) {
					System.out.println(e.getMessage());
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}

			}

			
		}

		

	}

	public static void displayImage(Color[][] publicImage, Color[][] secretImage) {

		// Public image on the left side

		int canvasW = secretImage[0].length + publicImage[0].length;
		int canvasH = publicImage.length;

		if (publicImage.length < secretImage.length) {
			canvasH = secretImage.length;
		}

		DUDraw.setCanvasSize(canvasW, canvasH);

		DUDraw.setXscale(0, canvasW);
		DUDraw.setYscale(0, canvasH);

		DUDraw.enableDoubleBuffering();

		if (publicImage != null) {
			for (int row = 0; row < publicImage.length; row++) {
				for (int col = 0; col < publicImage[0].length; col++) {
					DUDraw.setPenColor(publicImage[row][col]);
					DUDraw.point(col, row);
				}
			}
		}

		if (secretImage != null) {
			for (int row = 0; row < secretImage.length; row++) {
				for (int col = 0; col < secretImage[0].length; col++) {
					DUDraw.setPenColor(secretImage[row][col]);
					DUDraw.point(col + (canvasW / 2), row);
				}
			}
		}

		DUDraw.show();
	}

}
