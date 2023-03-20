import java.util.ArrayList;

import edu.du.dudraw.DUDraw;
import edu.du.dudraw.Draw;
import edu.du.dudraw.DrawListener;

public class WanderGame implements DrawListener {

	private Draw draw;
	private double xPos, yPos, size;
	private ArrayList<Food> foodList = new ArrayList<Food>();
	private int velocity = 5;

	public WanderGame(int w, int h) {
		draw = new Draw();
		draw.setCanvasSize(w, h);
		draw.setXscale(0, w);
		draw.setYscale(0, h);
		draw.addListener(this);
		
		xPos = (int)(Math.random()*w);
		yPos = (int)(Math.random()*h);
		size = 10;
		
		
		//Random food
		int numFood = 10;
		
		for(int i =0; i < numFood; i++) {
			int randX = (int)(Math.random()*w);
			int randY = (int)(Math.random()*h);
			foodList.add(new Food(randX, randY));
		}
		
		refresh();
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
		// here
		if (c == 'w') {
			yPos += velocity;	
		}
		
		if(c == 'a') {
			xPos -= velocity;
		}
		
		if(c == 's') {
			yPos -= velocity;
		}
		if(c == 'd') {
			xPos += velocity;
		}
		
			
		
		refresh();

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

	public class Food {
		public int xF, yF;

		public Food(int x, int y) {
			xF = x;
			yF = y;
			
		}
		
		public void draw() {
			draw.circle(xF, yF, 5);
		}
		
		
		
		//
		public void collision(Food food) {
			boolean xRange = this.xF < xPos + size && this.xF > xPos - size;
			boolean yRange = this.yF < yPos + size && this.yF > yPos - size;
			if( xRange && yRange ) {
				System.out.println("Range");
				//draw.setPenColor(DUDraw.WHITE);
				//draw.filledCircle(this.xF, this.yF, 6);
				//size += 5;
				foodList.remove(food);
				size += 20;
			}
		}
	}

	public void refresh() {
		// Re draw player
		draw.clear();
		draw.filledCircle(xPos, yPos, size);
		
		// draw food
		for(Food food : foodList) {
			food.draw();
			food.collision(food);
			
			
			
			
		}
		
	}

}
