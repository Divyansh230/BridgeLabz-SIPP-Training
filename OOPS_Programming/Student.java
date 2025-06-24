package OOPS_Programming;

// Base Class
public class Student {
    public int rollno;         // Public - accessible everywhere
    protected String name;     // Protected - accessible in same package or subclass
    private int cgpa;          // Private - only accessible inside this class

    // Constructor
    Student(int rollno, String name, int cgpa) {
        this.rollno = rollno;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Public method to get CGPA
    public int getCGPA() {
        return cgpa;
    }

    // Public method to set CGPA
    public void setCGPA(int cgpa) {
        this.cgpa = cgpa;
    }

    // Public method to display details
    public void displayDetails() {
        System.out.println("Roll Number: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
    }
}
