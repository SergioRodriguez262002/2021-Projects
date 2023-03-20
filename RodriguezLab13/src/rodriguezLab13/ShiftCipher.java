package rodriguezLab13;

public class ShiftCipher implements MessageEncoder {
	
	private int shift;

	public ShiftCipher(int shiftInput) {
		this.shift = shiftInput;
	}
	
	@Override
	public String encode(String plaintext) {
		String finalMessage = "";
		
		// Shift each individual char
		
		char c;
		char shifted;
		for(int i = 0; i < plaintext.length(); i++) {
			c = plaintext.charAt(i);
			shifted = (char) ((c + shift) % 128);
			finalMessage += shifted;
		}
		
		return finalMessage;
	}

}
