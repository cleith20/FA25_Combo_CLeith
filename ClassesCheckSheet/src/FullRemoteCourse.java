
public class FullRemoteCourse extends OnlineCourse{

	String email = "none";

	public FullRemoteCourse(String courseNumber, int numStudents, int maxStudents, int credits, String email) {
		super(courseNumber, numStudents, maxStudents, credits);
		this.email = email;
	}
	

	@Override
	public String toString() {
		return "Course: " + courseNumber + "\nNumber of Students: " + numStudents + "\nMax Number of Students: " + maxStudents
				+ "\nCredits: " + credits + "\nEmail: " + email;
	}

	
	
	
	
}
