
public class RealTimeRemoteCourse extends OnlineCourse{
	String zoomInfo = "none";

	public RealTimeRemoteCourse(String courseNumber, int numStudents, int maxStudents, int credits, String zoomInfo) {
		super(courseNumber, numStudents, maxStudents, credits);
		this.zoomInfo = zoomInfo;
	}

	public String getZoomInfo() {
		return zoomInfo;
	}

	public void setZoomInfo(String zoomInfo) {
		this.zoomInfo = zoomInfo;
	}

	@Override
	public String toString() {
		return "RealTimeRemoteCourse [zoomInfo=" + zoomInfo + ", courseNumber=" + courseNumber + ", numStudents="
				+ numStudents + ", maxStudents=" + maxStudents + ", credits=" + credits + "]";
	}

	
	
	
	
}
