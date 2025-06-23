package Object_Oriented_Programming;

class Student {
    // Attributes
    String name;
    int rollNumber;
    double marks;

    // Constructor
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Method to calculate grade based on marks
    public String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Name      : " + name);
        System.out.println("Roll No   : " + rollNumber);
        System.out.println("Marks     : " + marks);
        System.out.println("Grade     : " + calculateGrade());
    }
}

public class StudentReport {
    public static void main(String[] args) {
        // Example usage
        Student s1 = new Student("Alice", 101, 86.5);
        Student s2 = new Student("Bob", 102, 58.0);
        Student s3 = new Student("Charlie", 103, 94.2);

        System.out.println("----- Student Report -----");
        s1.displayDetails();
        System.out.println("--------------------------");
        s2.displayDetails();
        System.out.println("--------------------------");
        s3.displayDetails();
    }
}
