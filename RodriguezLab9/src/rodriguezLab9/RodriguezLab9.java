package rodriguezLab9;
import edu.du.dudraw.*;

public class RodriguezLab9 {

	public static void main(String[] args) {
		
		DUDraw.setCanvasSize(300,300);
		
		MovingCircle circle[] = new MovingCircle[4];
		
		circle[0] = new NormalCircle(Math.random() * 0.1);
		circle[1] = new NormalCircle(Math.random() * 0.1);
		
		circle[2] = new SpeedyCircle(Math.random() * 0.1);
		circle[3] = new SpeedyCircle(Math.random() * 0.1);
		
		//MovingCircle circle = new NormalCircle(0.05);
		//MovingCircle SpeedyCircle = new SpeedyCircle(0.05);
		
		DUDraw.enableDoubleBuffering();
		while(true) {
			DUDraw.clear();
			
			for(int i = 0; i < circle.length; i++) {
				circle[i].draw();
				circle[i].move();
			}
			
			DUDraw.show();
			DUDraw.pause(10);
		}
		
		
		
	}

}
