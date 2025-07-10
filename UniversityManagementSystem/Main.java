package UniversityManagementSystem;
import java.util.*;
public class Main {
	public static void main(String args[]) {
		UnderGraduate u1=new UnderGraduate("Divyansh","2215500064");
		List<String> elected=Arrays.asList("AI","Data Mining","Neural Networks","Generative AI");
		
		PostGraduate p1=new PostGraduate("Lucky","2215500069",elected);
		
		Course course1=new Course("Java Devlopment","CS0012",4);
		Course course2=new Course("MERN Stack Devlopment","CS0035",4);
		
		Enrollment e1=new Enrollment(u1,course1);
		Enrollment e2=new Enrollment(p1,course2);
		
		Faculty john=new Faculty("Johny");
		
		john.assignGrade(e1,"A");
		john.assignGrade(e2,"B");
		
		u1.viewTranscript();
		p1.viewTranscript();
	}
}
