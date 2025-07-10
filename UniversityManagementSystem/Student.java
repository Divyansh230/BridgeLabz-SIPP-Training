package UniversityManagementSystem;
import java.util.*;
public abstract class Student {

	private String name;
	private String id;
	private double totalPoints=0;
	private double totalCredits=0;
	List<String> electivePrefrence;
	
	public Student(String name,String id) {
		this.name=name;
		this.id=id;
		electivePrefrence=new ArrayList<>();
	}
	
	public Student(String name,String id,List<String>electivePrefrence) {
		this.name=name;
		this.id=id;
		this.electivePrefrence=electivePrefrence;
	}
	
	
	public void addGrade(double gradePoints,int credits) {
		totalPoints+=gradePoints*credits;
		totalCredits+=credits;
	}
	
	public double gpa() {
		if(totalCredits==0) {
			return 0.0;
		}
		return totalPoints/totalCredits;
	}
	public void viewTranscript() {
		System.out.println("\nTranscript for " + name + " (ID: " + id + ")");
        System.out.printf("GPA: %.2f\n",gpa());
        //String electivePreferences;
		if (!electivePrefrence.isEmpty()) {
            System.out.println("Elective Preferences: " + String.join(", ", electivePrefrence));
        } else {
            System.out.println("No elective preferences.");
        }
	}
	public String getName() {
		return this.name;
	}
	
}
