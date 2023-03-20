package rodriguezLab18;

import java.io.FileNotFoundException;
import java.io.*;
import java.util.*;

public class RodriguezLab18 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int[] arr = new int[100];

		System.out.println("Random array");
		for (int i = 0; i < 100; i++) {
			arr[i] = (int) (Math.random() * 100);
			System.out.print(arr[i] + " ");
		}

		int[] testArr = { 3, 2, 4, 1 };
		int unsortedNess = Sorting.selectionSort(testArr);

		System.out.println("\n");
		Sorting.selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}

		//System.out.println("\nUnsortedness" + unsortedNess);

		RandomAccessFile file = null;
		while (true) {
			try {
				System.out.println("\nInput the file name :");
				file = new RandomAccessFile(keyboard.next(), "r");
				int length = file.readInt();
				//System.out.println(length);
				int[] array = new int[length];
				for(int i = 0; i < length; i++) {
					array[i] = file.readInt();
				}
				System.out.println("Unsorted array\n");
				for(int i = 0; i < length; i++) {
					System.out.print(array[i]+" ");
				}
				System.out.println("\n");
				System.out.println("\nUnsortedness :"+Sorting.selectionSort(array) +"\nSorted Array\n");
				for(int i = 0; i < length; i++) {
					System.out.print(array[i]+" ");
				}
			} catch (FileNotFoundException e) {
				System.out.println(e.getMessage());
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
		
		

	}

}
