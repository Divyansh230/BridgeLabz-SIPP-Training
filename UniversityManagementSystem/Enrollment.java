package UniversityManagementSystem;

public class Enrollment {
	
	private Student student;
	private Course course;
	private String grade;
	
	public Enrollment(Student student,Course course) {
		this.student=student;
		this.course=course;
		this.grade=null;
	}
	public Student getStudent() {
		return this.student;
	}
	public Course getCourse() {
		return this.course;
	}
	
	public void setGrade(String grade) {
		this.grade=grade;
	}
	public String getGrade() {
		return this.grade;
	}
}
