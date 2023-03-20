/*Author: Sergio Rodriguez
 * Simple clock made using DUDraw.*/
package rodriguezClock;

import java.awt.Font;
import java.time.LocalTime;
import edu.du.dudraw.*;

public class Clock {

	public static void main(String[] args) {
		LocalTime theTime;
		theTime = LocalTime.now();
		int hour = theTime.getHour();
		int minute = theTime.getMinute();
		int second = theTime.getSecond();

		// Animation
		double goldenRatio = 1.618;

		int height = 300;
		// int width = (int) (height * goldenRatio);
		int width = height;

		DUDraw.setCanvasSize(width, height);
		Font font = new Font("Arial", Font.BOLD, 60); // 60 points size
		DUDraw.setFont(font);

		DUDraw.enableDoubleBuffering();

		// The radius of each hand and the radius of the clock and hour dots

		double secondRadius = 0.2;
		double minuteRadius = 0.18;
		double hourRadius = 0.15;
		double clockRadius = 0.24;
		double dotRadius = 0.22;
		double angle = 0;

		// Position of the analog clock
		double analogXPos = 0.5;
		double analogYPos = 0.5;

		while (true) {
			DUDraw.clear();

			// Getting the current time and creating a time variable, and getting hour,
			// minute, and second
			theTime = LocalTime.now();
			hour = theTime.getHour();
			hour = hour % 12;
			minute = theTime.getMinute();
			second = theTime.getSecond();

			DUDraw.setPenRadius(0.5);

			// Displaying the digital read out of time
			DUDraw.text(0.5, 0.1, hour + ":" + minute + ":" + second);

			// Analog clock
			// Draw clock face
			DUDraw.circle(analogXPos, analogYPos, clockRadius);
			// Draw hour dots
			for (int i = 0; i < 12; i++) {
				angle = (-2 * Math.PI * (i / 12.0)) + 0.5 * Math.PI;
				DUDraw.circle(analogXPos + dotRadius * Math.cos(angle), analogYPos + dotRadius * Math.sin(angle), 0.01);
			}

			// Second hand
			angle = (-2 * Math.PI * (second / 60.0)) + 0.5 * Math.PI;
			DUDraw.line(0.5, 0.5, analogXPos + secondRadius * Math.cos(angle),
					analogYPos + secondRadius * Math.sin(angle));

			// Minute hand
			DUDraw.setPenRadius(1.2);
			angle = (-2 * Math.PI * (minute / 60.0)) + 0.5 * Math.PI;
			DUDraw.line(0.5, 0.5, analogXPos + minuteRadius * Math.cos(angle),
					analogYPos + minuteRadius * Math.sin(angle));

			// Hour hand
			DUDraw.setPenRadius(1.8);
			angle = (-2 * Math.PI * (hour / 12.0)) + 0.5 * Math.PI;
			DUDraw.line(0.5, 0.5, analogXPos + hourRadius * Math.cos(angle), analogYPos + hourRadius * Math.sin(angle));

			// System.out.println(DUDraw.getPenRadius());

			DUDraw.show();
			DUDraw.pause(30);
		}

	}

}
