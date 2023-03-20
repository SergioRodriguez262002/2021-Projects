package rodriguezProject3;

import java.awt.*;

public class Steganography {
	public Steganography() {

	}

	public Color[][] extractSecretImage(Color[][] input) {
		Color[][] secretImage = new Color[input.length][input[0].length];

		// Converting color to int

		int redInt, greenInt, blueInt;

		byte byteRed, byteGreen, byteBlue;

		for (int row = 0; row < input.length; row++) {
			for (int col = 0; col < input[0].length; col++) {
				redInt = input[row][col].getRed();
				greenInt = input[row][col].getGreen();
				blueInt = input[row][col].getBlue();

				byteRed = (byte) redInt;
				byteGreen = (byte) greenInt;
				byteBlue = (byte) blueInt;

				byteRed *= 16; // Shifts all of the bits to the left by 4 bits, leaving 0s for the lowest 4
								// bits
				byteGreen *= 16;
				byteBlue *= 16;

				secretImage[row][col] = new Color(byteRed & 0xFF, byteGreen & 0xFF, byteBlue & 0xFF);
			}
		}

		return secretImage;
	}

	public Color[][] embedSecretImage(Color[][] publicImage, Color[][] privateImage) {
		Color[][] newImage = new Color[publicImage.length][publicImage[0].length];

		int redInt, greenInt, blueInt;

		byte byteRed, byteGreen, byteBlue;
		
		byte[][] bytePublicImage = new byte[publicImage.length][publicImage[0].length];

		// Clear least significant bytes from the public image and store to new Image
		for (int row = 0; row < publicImage.length; row++) {
			for (int col = 0; col < publicImage[0].length; col++) {
				// Remove least significan't digits
				// value - (value % 16) // Clears the lowest 4 bits, making them all 0, leaving
				// the highest 4 bits intact

				redInt = publicImage[row][col].getRed();
				greenInt = publicImage[row][col].getGreen();
				blueInt = publicImage[row][col].getBlue();

				byteRed = (byte) redInt;
				byteGreen = (byte) greenInt;
				byteBlue = (byte) blueInt;

				byteRed = (byte) (byteRed - (byteRed % 16));
				byteGreen = (byte) (byteGreen - (byteGreen % 16));
				byteBlue = (byte) (byteBlue - (byteBlue % 16));
				
				//bytePublicImage[row][col] =
				
				newImage[row][col] =  new Color(byteRed & 0xFF, byteGreen & 0xFF, byteBlue & 0xFF);

			}
		}
		
		//Inbed the private image into the new image
		
		byte byteRedPrivate = 0, byteGreenPrivate = 0,  byteBluePrivate = 0;
		int totalRow, totalCol;
		
		if(privateImage.length > publicImage.length) {
			totalRow = publicImage.length;
		} else {
			totalRow = privateImage.length;
		}
		
		if(privateImage[0].length > publicImage[0].length) {
			totalCol = publicImage[0].length;
		} else {
			totalCol = privateImage[0].length;
		}
		
		for (int row = 0; row < totalRow; row++) {
			for (int col = 0; col < totalCol; col++) {
				
				// Shifting the top 4 significant bits to the lower position and clearing the top 4 of the private image
				redInt = privateImage[row][col].getRed();
				greenInt = privateImage[row][col].getGreen();
				blueInt = privateImage[row][col].getBlue();

				byteRedPrivate = (byte) redInt;
				byteGreenPrivate = (byte) greenInt;
				byteBluePrivate = (byte) blueInt;
				
				byteRedPrivate /= 16; // Shifts the highest 4 bits to the lowest 4 bits, leaving 0s for the highest 4 bits
				byteGreenPrivate /= 16;
				byteBluePrivate /= 16;
				
				redInt = newImage[row][col].getRed();
				greenInt = newImage[row][col].getGreen();
				blueInt = newImage[row][col].getBlue();

				byteRed = (byte) ((byte) redInt + byteRedPrivate);
				byteGreen = (byte) ((byte) greenInt + byteGreenPrivate);
				byteBlue = (byte) ((byte) blueInt + byteBluePrivate);
				
				
				
				newImage[row][col] =  new Color(byteRed & 0xFF, byteGreen & 0xFF, byteBlue & 0xFF);

			}
		}
		
		
		
		
		//
		
		
		return newImage;
	}

}
