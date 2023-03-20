package rodriguezLab17;

import edu.du.dudraw.DUDraw;

public class RodriguezLab17 {

	public static void main(String[] args) {
		DUDraw.enableDoubleBuffering();
		DUDraw.setCanvasSize(800,500);
		DUDraw.setXscale(0,800);
		DUDraw.setYscale(0,500);
		
		RecursiveDrawings.drawCircles(200, 200, 100, 5);
		
		RecursiveDrawings.drawTreeRecursive(1, 75, 200, 50, 90);
		
		RecursiveDrawings.drawTreeRecursive(2, 150, 200, 50, 90);
		
		RecursiveDrawings.drawTreeRecursive(3, 275, 200, 50, 90);
		
		RecursiveDrawings.drawTreeRecursive(4, 400, 200, 50, 90);
		
		RecursiveDrawings.drawTreeRecursive(5, 550, 200, 50, 90);
		DUDraw.show();
	}
	
	
	
	
	
	
	
	/*public class Show {
		private Band[] bands;
		private int numBands;
		private String venueName;

		public Show(String v) {
			this.venueName = v;
			this.bands = new Band[3];
			this.numBands = 0;
		}

		public void addBand(Band b) {
			this.bands[numBands] = b;
			this.numBands++;
		}
		
		
		public Show(Show otherShow) {
			if(otherShow != null) {
				this.venueName = otherShow.venueName;
				this.numBands = otherShow.numBands;
				if(otherShow.bands != null) {
					for(int i = 0; i < otherShow.bands.length; i++) {
						if(otherShow.bands[i] != null) {
							this.bands[i] = new Bands()
						}
					}
				}
			}
		}
	}*/

}
