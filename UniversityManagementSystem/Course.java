package UniversityManagementSystem;

public class Course {
	private String coursecode;
	private String coursename;
	private int credits;
	
	public Course(String coursecode,String coursename,int credits) {
		this.coursecode=coursecode;
		this.coursename=coursename;
		this.credits=credits;
	}
	
	public String getCourseCode() {
		return this.coursecode;
	}
	
	public String coursename() {
		return this.coursename;
		
	}
	
	public int getCredits() {
		return this.credits;
	}
}
