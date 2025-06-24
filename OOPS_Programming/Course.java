package OOPS_Programming;
import java.util.*;
public class Course {
    String CourseName;
    int duration;
    int fees;
    Scanner sc=new Scanner(System.in);
    Course(String courseName, int duration, int fees) {
        this.CourseName = courseName;
        this.duration = duration;
        this.fees = fees;
    }

    void displayProductDetails() {
        System.out.println("Course Name: " + CourseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fees: " + fees);

    }

    void updateRegistrationfees(){
        int n_fees=sc.nextInt();
        this.fees+=n_fees;
    }

    public static void main(String[] args) {
        Course c1=new Course("C1",1,1);
        Course c2=new Course("C2",2,2);
        Course c3=new Course("C3",3,3);
        Course c4=new Course("C4",4,4);
        c1.displayProductDetails();
        c1.updateRegistrationfees();
    }
}
