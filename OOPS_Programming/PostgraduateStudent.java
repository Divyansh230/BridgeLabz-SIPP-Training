package OOPS_Programming;

// Subclass in same package accessing protected member 'name'
public class PostgraduateStudent extends Student {

    String specialization;

    PostgraduateStudent(int rollno, String name, int cgpa, String specialization) {
        super(rollno, name, cgpa);
        this.specialization = specialization;
    }

    // Method using protected member 'name'
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Name: " + name);  // accessing protected member
        System.out.println("Specialization: " + specialization);
    }
    public static void main(String[] args) {
        Student student = new Student(101, "Amit", 8);
        student.displayDetails();

        // Access and modify CGPA using public methods
        student.setCGPA(9);
        System.out.println("Updated CGPA: " + student.getCGPA());

        System.out.println("\n----- Postgraduate Student -----");
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Priya", 9, "Computer Science");
        pgStudent.displayPostgraduateDetails();
        pgStudent.displayDetails();  // inherited from Student
    }
}
