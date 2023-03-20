package rodriguezLab9;

import edu.du.dudraw.DUDraw;

public class NormalCircle extends MovingCircle {
	
	

	public NormalCircle(double r) {
		super(r);
		super.setColor(DUDraw.BLUE);
		
		
	}
	
	@Override
	public void move() {
		super.foward();
		super.bounce();
		
		
	}

}
