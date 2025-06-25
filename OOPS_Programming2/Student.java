package OOPS_Programming2;

public class Student {
    static String University="GLA University";
    static int totalStudents=0;
    String name;
    final String rollNo;
    double cgpa;

    public Student(String name,String rollNo,double cgpa) {
        this.name=name;
        this.rollNo=rollNo;
        this.cgpa=cgpa;
        totalStudents++;
    }

    static void totalStudents(){
        System.out.println(totalStudents);
    }
    void displayStudentDetails(){
        if(this instanceof Student){
            System.out.println("Name: "+name);
            System.out.println("Roll No: "+rollNo);
            System.out.println("CGPA: "+cgpa);

        }
        else{
            System.out.println("Employee does not exists");
        }
    }

    public static void main(String[] args) {
        Student student=new Student("GLA University","Lucknow",1200.00);
        student.displayStudentDetails();
        totalStudents();
    }
}
