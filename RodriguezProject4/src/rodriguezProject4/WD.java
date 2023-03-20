package rodriguezProject4;

import java.awt.Color;
import java.util.ArrayList;

import edu.du.dudraw.Draw;
import edu.du.dudraw.DrawListener;

public class WD implements DrawListener {
	private Draw draw;
	private ArrayList<Window> windows;
	private double xScale, yScale;
	
	public WD(double x, double y) {
		draw = new Draw();
		this.xScale=x;
		this.yScale=y;
		windows = new ArrayList<Window>();
		draw.setCanvasSize((int)this.xScale, (int)this.yScale);
		draw.setXscale(0, this.xScale);
		draw.setYscale(0, this.yScale);
		
	}
	
	public void addWindow(double x, double y, double xSize, double ySize, Color color) {
		windows.add(new Window(x,y,xSize,ySize,color));
	}
	
	public void refresh() {
		for(Window s: windows) {
			s.refreshWindow();
		}
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
	public void keyTyped(char arg0) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseClicked(double arg0, double arg1) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseDragged(double arg0, double arg1) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mousePressed(double arg0, double arg1) {
		// TODO Auto-generated method stub
	}
	@Override
	public void mouseReleased(double arg0, double arg1) {
		// TODO Auto-generated method stub
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
	}
	
	private class Window{
		private double xPos, yPos, xSize, ySize;
		private Color windowColor;
		
		public Window(double x, double y, double width, double hight, Color color) {
			this.xPos=x;
			this.yPos=y;
			this.xSize=width;
			this.ySize=hight;
			this.windowColor= new Color(color.getRed(), color.getGreen(), color.getBlue());
		}
		
		public void refreshWindow() {
			draw.setPenColor(windowColor);
			draw.filledRectangle(xPos, yPos, xSize, ySize);
		}
	}
}