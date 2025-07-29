package StudentManagementSystem;

import java.util.*;
public class Main {
    public static void main(String[] args) {
    	StudentManagementSystem sms = new StudentManagementSystem();

        Student s1 = new Student(1, "Alice", 20,
                Set.of("Math", "Physics"),
                Map.of("Math", 92.0, "Physics", 88.5));
        Student s2 = new Student(2, "Bob", 21,
                Set.of("Chemistry", "Math"),
                Map.of("Chemistry", 75.0, "Math", 80.0));
        Student s3 = new Student(3, "Charlie", 19,
                Set.of("Math", "Biology"),
                Map.of("Math", 85.0, "Biology", 91.0));

        sms.addStudent(s1);
        sms.addStudent(s2);
        sms.addStudent(s3);

        System.out.println("Search by ID (2): " + sms.getById(2));

        System.out.println("\nSearch by name 'al': " + sms.searchByName("al"));

        System.out.println("\nSorted by name:");
        for (Student s : sms.sortedByName()) {
            System.out.println(s);
        }

        System.out.println("\nSorted by average grade (desc):");
        for (Student s : sms.sortedByAverageGradeDesc()) {
            System.out.println(s);
        }

        System.out.println("\nStudents enrolled in Math:");
        for (Student s : sms.findBySubject("Math")) {
            System.out.println(s);
        }

        System.out.println("\nRemoving student with ID 2...");
        sms.removeStudent(2);
        System.out.println("Size now: " + sms.size());
    }
}
