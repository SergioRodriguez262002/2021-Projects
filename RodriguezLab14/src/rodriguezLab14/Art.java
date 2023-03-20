package rodriguezLab14;

import java.util.*;

public class Art {
	private String name;
	private String artist;
	private ArrayList<String> tags;
	
	
	// Wrapper classes tutorial

	public Art(String name, String artist) {
		this.name = name;
		this.artist = artist;
		tags = new ArrayList<String>();
	}
	
	public String getName() {
		return name;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void addTags(String newTag) {
		tags.add(newTag);
	}
	
	public boolean matches(String tag) {
		for(int i = 0; i < tags.size(); i++) {
			if(tags.get(i).equals(tag)) {
				return true; 
			}
		}
		return false;
	}
	
}
