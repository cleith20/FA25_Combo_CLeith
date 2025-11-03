
public class InPersonCourse extends Course{
	String roomNum = "none";

	public InPersonCourse(String courseNumber, int numStudents, int maxStudents, int credits, String roomNum) {
		super(courseNumber, numStudents, maxStudents, credits);
		this.roomNum = roomNum;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	@Override
	public String toString() {
		return "Course: " + courseNumber + "\nNumber of Students: " + numStudents + "\nMax Number of Students: " + maxStudents
				+ "\nCredits: " + credits + "\nRoom Number: " + roomNum;
	}
	
	
	
}
