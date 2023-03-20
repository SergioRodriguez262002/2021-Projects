import edu.du.dudraw.Draw;

import java.awt.Color;

import edu.du.dudraw.*;

public class LotsOfCircles implements DrawListener {
	
	private Draw draw;
	
	public LotsOfCircles() {
		draw = new Draw();
		draw.setCanvasSize(500,500);
		draw.setXscale(0,500);
		draw.setYscale(0,500);
		draw.addListener(this);
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
		if(c == 'q') {
			System.out.println("Q key typed");
		}

	}

	@Override
	public void mouseClicked(double x, double y) {
		// TODO Auto-generated method stub
		Color color = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
		draw.setPenColor(color);
		draw.filledCircle(x, y, Math.random()*50);

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

}
