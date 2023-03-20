package octalNumber;

public class octalNumber {

	enum Planet {
		mercury, venus, earth, mars, jupiter, saturn, uranus, neptune
	};

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int count = 25;
		for(int i = 0; i < 5; i++) {
			for(int x = 0; x < 5; x++) {
				arr[i][x] = count;
				count -= 1;
			}
		}
		
		
		for(int i = 0; i < 5; i++) {
			for(int x = 0; x < 5; x++) {
				System.out.print(arr[i][x] + " ");
			}
			System.out.println("\n");
		}

	}

}
