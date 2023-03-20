package practiceExercises5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class PracticeExercises5 {

	public static void main(String[] args) {

		System.out.println(recursiveMethod(6));

	}

	public static int recursiveMethod(int n) {
		if (n < 2) {
			return 3;
		}
		return recursiveMethod(n - 2) * 2;
	}

}
