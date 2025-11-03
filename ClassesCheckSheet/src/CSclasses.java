import java.util.ArrayList;

public class CSclasses {

	public static void main(String[] args) {
		Course [] CSclasses = new Course[3];
		
		CSclasses[0] = new InPersonCourse("CSC 1060", 20, 20, 20, "BP120");
		CSclasses[0] = new RealTimeRemote("CSC 1060", 20, 20, 20, "BP120");
		
		for(Course one : CSclasses) {
		System.out.println(one);
		System.out.println();
		}
	}

}
