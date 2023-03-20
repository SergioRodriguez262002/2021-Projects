package rodriguezLab18;

public class Sorting {
	
	public Sorting() {
		
	}

	public static int selectionSort(int[] arr) {
		int min;
		int indexSmallerInt;
		int timesSwapped = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			min = arr[i];
			indexSmallerInt = i;
			for(int j = i; j < arr.length; j++) {
				if(arr[j] < min) {
					indexSmallerInt = j;
					min = arr[j];
					timesSwapped ++;
				}
			}
			arr[indexSmallerInt] = arr[i];
			arr[i] = min;
			
		}
		
		return timesSwapped;
	}
}
