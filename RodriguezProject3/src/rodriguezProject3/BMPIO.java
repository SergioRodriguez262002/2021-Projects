package rodriguezProject3;

import java.awt.Color;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.awt.Color;
import java.io.IOException;
import java.io.RandomAccessFile;

public class BMPIO {
	/*
	 * Essential information on BMP files format: See
	 * https://en.wikipedia.org/wiki/BMP_file_format for more information
	 * 
	 * The first byte of the file must be 'B' == 0x42 The second byte of the file
	 * must be 'M' == 0x4D At byte 10 of the file is a four-byte integer giving the
	 * offset where the pixel map starts. We require this value to be 54. If it's
	 * not, we will report an error in the bitmap format and fail to read the file.
	 * Note: integers in BMP files are stored in little-endian form, which means
	 * that the least-significant byte comes first But RandomAccessFile assumes
	 * big-endian form. After reading an integer from the file, use
	 * Integer.reverseBytes(num) to convert from little-endian to big-endian
	 */
	public static Color[][] readBMPfile(String fileName) throws IOException, BMPIOException {

		byte char1, char2;
		int offset;
		RandomAccessFile raf = new RandomAccessFile(fileName, "r");
		char1 = raf.readByte();
		char2 = raf.readByte();
		if (char1 != 'B' || char2 != 'M') {
			raf.close();
			return null;
		}
		raf.seek(10);
		offset = raf.readInt();
		offset = Integer.reverseBytes(offset);
		if (offset != 54) {
			return null;
		}

		//
		raf.seek(18);
		int width = raf.readInt();
		// raf.seek(22);
		int height = raf.readInt();

		width = Integer.reverseBytes(width);
		height = Integer.reverseBytes(height);

		if (width % 4 > 1) {
			return null;
		}

		Color[][] data = new Color[height][width];

		raf.seek(28);
		short is24 = raf.readShort();

		is24 = Short.reverseBytes(is24);

		if (is24 != 24) {
			return null;
		}

		raf.seek(54);

		int blue, green, red;

		for (int row = 0; row < height; row++) {
			for (int col = 0; col < width; col++) {
				// r,g,b
				blue = raf.readUnsignedByte();
				green = raf.readUnsignedByte();
				red = raf.readUnsignedByte();
				data[row][col] = new Color(red, green, blue);
			}
		}
		raf.close();

		return data;

	}
	/*
	 * At byte 18 of the file are two four-byte integers giving the width and height
	 * (in that order) of the image. Again, these are in little-endian form. We
	 * require that each of these numbers be divisible by 4. If either are not, we
	 * will report an error in the bitmap format and fail to read the file. At byte
	 * 28 of the file is a two-byte integer giving the number of bits per pixel We
	 * require this number must be 24 (one byte for each color) If it's not, we will
	 * report an error in the bitmap format and fail to read the file. Note: this
	 * two-byte integer is also in little-endian form, so use Short.reverseBytes()
	 * after reading the number from the file. At byte 54, the pixel map data
	 * begins. Each pixel is represented by three bytes (blue, then green, then
	 * red). The image usually starts at the lower left and proceeds upwards. Recall
	 * that colors are always positive, so read these from the file as unsigned
	 * bytes.
	 */

	/*
	 * This method should copy the BMP file from 'in_path' to 'out_path' and then
	 * use the contents of the 'image' array to overwrite the image data in the
	 * appropriate place in the copy.
	 *
	 * Usage: writeBMPCopy("original.bmp", "copy.bmp", <2D array of embedded image
	 * color data>)
	 */

	public static void writeBMPCopy(String in_path, String out_path, Color[][] image) throws IOException {
		Path src = Paths.get(in_path);
		Path dst = Paths.get(out_path);
		

		// Copy the file from input to output
		Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING);

		// TODO: Open the output file using a RandomAccessFile, and use
		// the contents of the 'image' array to overwrite the
		// color data in the appropriate place in the output file

		RandomAccessFile out = new RandomAccessFile(out_path, "rw");
		
		int offset;
		byte char1 = out.readByte();
		byte char2 = out.readByte();
		if (char1 != 'B' || char2 != 'M') {
			out.close();
			System.out.println("Doesnt pass the BM test");
		}
		out.seek(10);
		offset = out.readInt();
		offset = Integer.reverseBytes(offset);
		if (offset != 54) {
			System.out.println("Offset not 54");
		}

		//
		out.seek(18);
		int width = out.readInt();
		// raf.seek(22);
		int height = out.readInt();

		width = Integer.reverseBytes(width);
		height = Integer.reverseBytes(height);

		if (width % 4 > 1) {
			System.out.println("width % 4 > 1");
		}

		Color[][] data = new Color[height][width];

		out.seek(28);
		short is24 = out.readShort();

		is24 = Short.reverseBytes(is24);

		if (is24 != 24) {
			System.out.println("Not is 24");
		}

		out.seek(54);

		int blue, green, red;
		byte byteRed, byteGreen, byteBlue;

		for (int row = 0; row < height; row++) {
			for (int col = 0; col < width; col++) {
				red = image[row][col].getRed();
				green = image[row][col].getGreen();
				blue = image[row][col].getBlue();

				byteRed = (byte) red;
				byteGreen = (byte) green;
				byteBlue = (byte) blue;
				
				// blue, green, red

				out.write(byteBlue); 
				out.write(byteGreen);
				out.write(byteRed);  //& 0xFF
				//System.out.println("Byte");
			}
		}
		
		out.close();

		//
		// etc...
		//
	}

}