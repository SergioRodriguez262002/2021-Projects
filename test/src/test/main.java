package test;

import edu.du.dudraw.DUDraw;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] test = new int[10][10];
		int x = 0;
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {
				x += 1;
				test[row][col] = x;
			}
		}
		
		DUDraw.setCanvasSize(700,700);
		DUDraw.setXscale(0,100);
		DUDraw.setYscale(0,100);
		
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {
				DUDraw.text((row * 10)+5, (col * 10)+5, ""+test[row][col]);
			}
		}

	}

}
