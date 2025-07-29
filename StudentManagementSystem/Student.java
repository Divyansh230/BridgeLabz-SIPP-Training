package StudentManagementSystem;

import java.util.*;
class Student {
    private final int id;
    private String name;
    private int age;
    private final Set<String> subjects;
    private final Map<String, Double> grades;

    public Student(int id, String name, int age, Set<String> subjects, Map<String, Double> grades) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.subjects = new HashSet<>(subjects);
        this.grades = new HashMap<>(grades);
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public Set<String> getSubjects() { return subjects; }
    public Map<String, Double> getGrades() { return grades; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    public double getAverageGrade() {
        if (grades.isEmpty()) return 0.0;
        double sum = 0.0;
        for (double g : grades.values()) {
            sum += g;
        }
        return sum / grades.size();
    }

    @Override
    public String toString() {
        return "Student{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", age=" + age +
               ", avgGrade=" + String.format("%.2f", getAverageGrade()) +
               ", subjects=" + subjects +
               '}';
    }
}

