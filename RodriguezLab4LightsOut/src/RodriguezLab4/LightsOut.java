
package RodriguezLab4;
import java.util.*;
import edu.du.dudraw.*;
public class LightsOut {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int rows, columns; // this will be the size of the array of windows
		
		System.out.print("Please enter the number of rows, followed by the number of columns: ");
		rows = keyboard.nextInt();
		columns = keyboard.nextInt();

		LightsOutGameboard bg = new LightsOutGameboard(rows, columns);
		bg.draw();

		DUDraw.enableDoubleBuffering();
		while (!bg.allOff() && !bg.allOn()) {
			if (DUDraw.isMousePressed()) {
				bg.clickLight(DUDraw.mouseY(),DUDraw.mouseX());
				bg.draw();
				bg.drawToConsole();
			}
			DUDraw.pause(150);
			DUDraw.show();
		}
		DUDraw.pause(150);
		// The game is over: give a message to the user
		if (bg.allOff()) {
			DUDraw.setPenColor(DUDraw.WHITE);
			DUDraw.text(rows/2.0, columns/2.0, "You win! Lights Out!");
		} else if (bg.allOn()) {
			DUDraw.setPenColor(DUDraw.BLACK);
			DUDraw.text(rows/2.0, columns/2.0, "You lose! All the lights are on!");
		}
			
		
		keyboard.close();			
	}


}
