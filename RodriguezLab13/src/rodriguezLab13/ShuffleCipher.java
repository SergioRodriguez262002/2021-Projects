package rodriguezLab13;

public class ShuffleCipher implements MessageEncoder {
	private int shuffles;

	public ShuffleCipher(int n) {
		shuffles = n;
	}

	@Override
	public String encode(String plaintext) {
		// TODO Auto-generated method stub
		
		
		for(int i = 0; i < shuffles; i++) {
			plaintext = Shuffle(plaintext);
		}
		
		
		
		return plaintext;
	}

	private String Shuffle(String text) {
		String part1, part2;
		String finalMessage = "";
		
		// Get the half num
		int half1, half2;
		int evenHalf;
		if (text.length() % 2 == 1) {
			half1 = (text.length() + 1) / 2;
			half2 = half1 - 1;
			
			
			
			part1 = text.substring(0,half1);
			part2 = text.substring(half1, text.length());
			
			for(int i = 0; i < half1; i++) {
				
			}
			
			
		} else {
			evenHalf = text.length() / 2;
			//Getting the first half
			part1 = text.substring(0, evenHalf);
			part2 = text.substring(evenHalf , text.length());
			
			//System.out.println(part1);
			//System.out.println(part2);
			
			for(int i = 0; i < text.length()/2; i++) {
				//String contact = part1.charAt(i) + part2.charAt(i);
				finalMessage += (""+part1.charAt(i) + part2.charAt(i));
			}
		}
		
		return finalMessage;
		
		

	}

}
