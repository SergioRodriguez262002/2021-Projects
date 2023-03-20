package rodriguezLab13;

public class EncoderDriver {

	public static void main(String[] args) {
		MessageEncoder encrypt = new ShiftCipher(3);
		MessageEncoder decrypt = new ShiftCipher(-3);
		
		System.out.println(encrypt.encode("facetiously"));
		System.out.println(decrypt.encode(encrypt.encode("facetiously")));
		
		
		ShuffleCipher shuffle = new ShuffleCipher(1);
		System.out.println(shuffle.encode("abcdefghi"));
		
		
		Integer int1 = new Integer(7);
		Integer int2 = 9;
		int m = 11; 
		m = int2.intValue();
		
		
	}

}
