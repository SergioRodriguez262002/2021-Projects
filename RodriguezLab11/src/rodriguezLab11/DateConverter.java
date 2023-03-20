package rodriguezLab11;

import java.util.Scanner;

public class DateConverter {

	Scanner keyboard = new Scanner(System.in);

	public static void main(String[] args) {

		while (true) {
			try {
				Scanner keyboard = new Scanner(System.in);

				System.out.println("\nEnter a date to be converted");
				System.out.println("Month?");
				int month = keyboard.nextInt();
				System.out.println("Day?");
				int day = keyboard.nextInt();

				System.out.println(convert(month, day));

			} catch (MonthException e) {
				System.out.println(e.getMessage());
			} catch (DayException e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public static String convert(int month, int day) throws DayException, MonthException {
		int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		if (month > 12 || month <= 0) {
			throw new MonthException();
		}
		if (daysInMonth[month-1] < day || day < 0) {
			throw new DayException();
		}

		return months[month-1] + " "+day;
	}

}
