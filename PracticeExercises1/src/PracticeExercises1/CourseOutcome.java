package PracticeExercises1;

public class CourseOutcome {
	String studentID;
	String courseName;
	double grade;
	int hours;
	
	public CourseOutcome(String numID, String course, double inputGrade, int totalHours) {
		studentID = numID;
		courseName = course;
		grade = inputGrade;
		hours = totalHours;
	}
	
	public String toString() {
		return this.studentID+" scored "+this.grade+" in "+this.courseName+", "+this.hours+"";
	}
	
	public boolean equals(CourseOutcome student) {
		boolean hours = this.hours == student.hours;
		boolean course = this.courseName.equals(student.courseName);
		boolean grade = this.grade == student.grade;
		boolean id = this.studentID.equals(student.studentID);
		return (hours && course && grade && id);
	}
	
	

}
