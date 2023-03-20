package rodriguezLab10;

public class Course {
	private int id;
	private String name;

	public Course(int i, String n) {
		this.id = i;
		this.name = n;
	}

	public Course(Course c) {
		if(c == null) {
			this.id = 0;
			this.name = "N/A";
		} else {
			this.id = c.id;
			this.name = c.name;
		}
	}

	// TODO: Implement an equals method
	@Override
	public boolean equals(Object other) {
		if(other == null) {
			return false;
		}
		
		if(this == other) {
			return true;
		}
		
		if(!this.getClass().equals(other.getClass())) {
			return false;
		}
		
		Course otherCourse = (Course) other;
		return this.id == otherCourse.id && this.name.equals(otherCourse.name);
	}
	
}