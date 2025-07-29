package StudentManagementSystem;

import java.util.*;
class StudentManagementSystem {
    private final Map<Integer, Student> studentsById = new HashMap<>();

    // Add student
    public boolean addStudent(Student s) {
        if (studentsById.containsKey(s.getId())) return false;
        studentsById.put(s.getId(), s);
        return true;
    }

    // Remove student
    public boolean removeStudent(int id) {
        return studentsById.remove(id) != null;
    }

    // Search by ID
    public Student getById(int id) {
        return studentsById.get(id);
    }

    // Search by Name (case-insensitive, partial match)
    public List<Student> searchByName(String namePart) {
        List<Student> result = new ArrayList<>();
        for (Student s : studentsById.values()) {
            if (s.getName().toLowerCase().contains(namePart.toLowerCase())) {
                result.add(s);
            }
        }
        return result;
    }

    // Sort by Name
    public List<Student> sortedByName() {
        List<Student> list = new ArrayList<>(studentsById.values());
        list.sort(new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s1.getName().compareToIgnoreCase(s2.getName());
            }
        });
        return list;
    }

    // Sort by Average Grade (Descending)
    public List<Student> sortedByAverageGradeDesc() {
        List<Student> list = new ArrayList<>(studentsById.values());
        list.sort(new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return Double.compare(s2.getAverageGrade(), s1.getAverageGrade());
            }
        });
        return list;
    }

    // Find all students enrolled in a particular subject
    public List<Student> findBySubject(String subject) {
        List<Student> result = new ArrayList<>();
        for (Student s : studentsById.values()) {
            if (s.getSubjects().contains(subject)) {
                result.add(s);
            }
        }
        return result;
    }

    public int size() {
        return studentsById.size();
    }
}


