package rodriguezProject3;

public class BMPIOException extends Exception {
	
	public BMPIOException() {
		super("BMPIO: unsupported header size in .bmp file");
	}

}
