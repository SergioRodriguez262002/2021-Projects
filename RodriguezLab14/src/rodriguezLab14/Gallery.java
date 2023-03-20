package rodriguezLab14;

import java.util.ArrayList;

public class Gallery {
	public ArrayList<Art> artObjects;

	public Gallery() {
		artObjects = new ArrayList<Art>();
	}

	public void addPiece(Art addition) {
		artObjects.add(addition);
	}

	public void printCollection() {
		for (Art art : artObjects) {
			System.out.println();
			System.out.println("Name:   " + art.getName());
			System.out.println("Artist: " + art.getArtist());
		}
	}
	
	public int numberBy(String artist) {
		int count = 0;
		for(Art art : artObjects) {
			if(art.getArtist().equals(artist)) {
				count ++;
			}
		}
		return count;
	}
	
	public int numberMatching(String tag) {
		int count = 0;
		for(Art art : artObjects) {
			if(art.matches(tag)) {
				count++;
			}
		}
		return count;
	}

}
