
public class Course {

	String courseNumber = "none";
	int numStudents = 0;
	int maxStudents = 0;
	int credits = 0;
	
	public Course() {
		this.courseNumber = "none";
		this.numStudents = 0;
		this.maxStudents = 0;
		this.credits = 0;
	}
	
	public Course(String courseNumber, int numStudents, int maxStudents, int credits) {
		super();
		this.courseNumber = courseNumber;
		this.numStudents = numStudents;
		this.maxStudents = maxStudents;
		this.credits = credits;
	}

	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public int getNumStudents() {
		return numStudents;
	}

	public void setNumStudents(int numStudents) {
		this.numStudents = numStudents;
	}

	public int getMaxStudents() {
		return maxStudents;
	}

	public void setMaxStudents(int maxStudents) {
		this.maxStudents = maxStudents;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	@Override
	public String toString() {
		return "Course: " + courseNumber + "\nNumber of Students: " + numStudents + "\nMax Number of Students: " + maxStudents
				+ "\nCredits: " + credits;
	}
	
	
	
	
}
