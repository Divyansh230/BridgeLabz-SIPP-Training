package UniversityManagementSystem;

public class Faculty implements Graded{
	
	private String name;
	public Faculty(String name) {
		this.name=name;
	}
	@Override
	public void assignGrade(Enrollment enrollment, String grade) {
		enrollment.setGrade(grade);
		double gradePoints=convertGradeToPoints(grade);
		enrollment.getStudent().addGrade(gradePoints, enrollment.getCourse().getCredits());
		
		  System.out.println("Faculty " + name + " assigned grade " + grade +
	                " to " + enrollment.getStudent().getName() +
	                " for course " + enrollment.getCourse().coursename());
	}
	public double convertGradeToPoints(String grade) {
		return switch(grade) {
		 case "A" -> 4.0;
         case "B" -> 3.0;
         case "C" -> 2.0;
         case "D" -> 1.0;
         case "F" -> 0.0;
         default -> 0.0;
		};
		
			
	}

}
