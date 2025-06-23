package Object_Oriented_Programming;

import java.util.Scanner;

public class EmployeeDetails {
   private String name;
   private long employeeID;
   private long salary;

    public EmployeeDetails(String name, long employeeID, long salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.salary = salary;
    }
    public String getname(){
        return this.name;
    }
    public long getemployeeID(){
        return this.employeeID;
    }
    public long getsalary(){
        return this.salary;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the employee");
        String name = sc.nextLine();
        System.out.println("Enter the employee ID");
        long employeeID = sc.nextLong();
        System.out.println("Enter the salary of the employee");
        long salary = sc.nextLong();
        EmployeeDetails emp = new EmployeeDetails(name, employeeID, salary);
        System.out.println("Name : " + emp.getname());
        System.out.println("Employee ID : " + emp.getemployeeID());
        System.out.println("Salary : " + emp.getsalary());
    }
}
