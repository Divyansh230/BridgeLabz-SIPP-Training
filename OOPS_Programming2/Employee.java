package OOPS_Programming2;

public class Employee {
    static String CompanyName="JetBrains";
    static int totalEmployees=0;
    String name;
    final String id;
    String designation;
    public Employee(String name, String designation, String id) {
        this.name = name;
        this.designation = designation;
        this.id = id;
        totalEmployees++;
    }

    static void totalEmployees(){
        System.out.println("Total Employees: "+totalEmployees);
    }
    void displayEmployeeDetails(){
        if(this instanceof Employee){
            System.out.println("Name: "+name+" Designation: "+designation);
        }
        else{
            System.out.println("Not an Employee");
        }
    }

    public static void main(String[] args) {
        Employee employee=new Employee("Divyansh","Lucknow","2215500064");

        employee.displayEmployeeDetails();
        totalEmployees();
    }
}
