package rodriguezProject4;

import java.awt.Color;
import java.awt.Window;

import edu.du.dudraw.DUDraw;
import edu.du.dudraw.Draw;

public class WindowDriver {

	public static void main(String[] args) {
		int height = 300;
		int width = (int)(height * ( 1 + Math.sqrt(5))/2);
		
		WD display = new WD(200,200);
		display.addWindow(50, 50, 60, 80, Draw.BLUE);
		display.addWindow(100, 130, 80, 80, Draw.RED);
		display.addWindow(80, 80, 60, 80, Draw.GREEN);
		display.addWindow(120, 60, 100, 80, Draw.BLACK);
		display.refresh();
		
		
		
				
	}

}
