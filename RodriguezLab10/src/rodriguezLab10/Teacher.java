package rodriguezLab10;

public class Teacher {
	private String name;
	private int id;
	private Course[] courses;
	private int numCourses;

	public Teacher(String n, int i) {
		this.name = n;
		this.id = i;
		this.courses = new Course[3];
		this.numCourses = 0;
	}

	public Teacher(Teacher t) {
		this.name = t.name;
		this.id = t.id;
		this.courses = new Course[3];
		this.numCourses = 0;
		for (int i = 0; i < t.numCourses; i++) {
			if (t.courses[i] == null) {
				continue;
			}
			this.numCourses++;
			this.courses[i] = new Course(t.courses[i]);
		}
	}

	public void addCourse(Course c) {
		this.courses[numCourses] = new Course(c);
		this.numCourses++;
	}

	// TODO: Implement an equals method

	public boolean equals(Object other) {
		if (other == null) {
			return false;
		}

		if (this == other) {
			return true;
		}

		if (!this.getClass().equals(other.getClass())) {
			return false;
		}

		Teacher otherTeacher = (Teacher) other;
		
		for(int i = 0; i < this.numCourses; i++) {
			if(!this.courses[i].equals(otherTeacher.courses[i])) {
				return false;
			}
		}

		return this.name == otherTeacher.name && this.id == otherTeacher.id 
				&& this.numCourses == otherTeacher.numCourses;

	}

}