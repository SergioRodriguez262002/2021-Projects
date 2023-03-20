package rodriguezProject4;

import java.awt.Color;
import java.util.ArrayList;

import edu.du.dudraw.Draw;
import edu.du.dudraw.DrawListener;

public class WindowDisplay implements DrawListener {

	private ArrayList<Window> windows, originalWindows;
	private Draw canvas;

	public WindowDisplay(int xScale, int yScale) {
		canvas = new Draw();
		canvas.setCanvasSize(xScale, yScale);
		canvas.setXscale(0, xScale);
		canvas.setYscale(0, yScale);
		canvas.addListener(this);
		windows = new ArrayList<Window>();
		originalWindows = new ArrayList<Window>();
	}

	public void addWindow(int xPos, int yPos, int x, int y, Color color) {
		windows.add(new Window(xPos, yPos, x, y, color));
		originalWindows.add(new Window(xPos, yPos, x, y, color));
		refresh();
	}

	public void addWindow(WindowDisplay.Window window) {
		windows.add(window);
	}

	public void refresh() {
		canvas.clear();
		for (Window w : windows) {
			w.refreshWindow();
		}
		System.out.println("Size: " + windows.size());
	}

	@Override
	public void keyPressed(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(char c) {
		// TODO Auto-generated method stub
		if (c == 'Q') {
			System.exit(0);
		}
		if (c == 'R') {
			windows.clear();
			for (int i = 0; i < originalWindows.size(); i++) {
				windows.add(new Window(originalWindows.get(i)));
			}

			refresh();

		}

	}

	@Override
	public void mouseClicked(double x, double y) {

	}

	@Override
	public void mouseDragged(double x, double y) {
		int diffx, diffy;
		for (int i = windows.size() - 1; i >= 0; i--) {
			if (windows.get(i).positionStatus(x, y)) {

				windows.get(i).xPos = x;
				windows.get(i).yPos = y;
				refresh();
				break;
			}
		}
	}

	@Override
	public void mousePressed(double x, double y) {
		System.out.println("Pressed");
		Window move, top;
		for (int i = windows.size() - 1; i >= 0; i--) {
			if (windows.get(i).positionStatus(x, y)) {
				windows.add(windows.get(i));
				windows.remove(i);
				break;
			}
		}

		refresh();
	}

	@Override
	public void mouseReleased(double arg0, double arg1) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	public class Window {
		private double xPos, yPos, width, height, ogX, ogY;
		Color color;

		public Window(int xPosition, int yPosition, int x, int y, Color c) {
			xPos = xPosition;
			yPos = yPosition;
			width = x;
			height = y;
			color = c;

			ogX = xPos;
			ogY = yPos;
		}

		public Window(Window other) {
			xPos = other.xPos;
			yPos = other.yPos;
			width = other.width;
			height = other.height;
			color = other.color;
		}

		public void refreshWindow() {
			canvas.setPenColor(color);
			canvas.filledRectangle(xPos, yPos, width, height);
		}

		public boolean positionStatus(double x, double y) {
			if (x < xPos + width && x > xPos - width && y < yPos + height && y > yPos - height) {
				System.out.println(color.toString());
				return true;
			} else {
				return false;
			}
		}

		public void resetPos() {
			xPos = ogX;
			yPos = ogY;
		}

	}

}
