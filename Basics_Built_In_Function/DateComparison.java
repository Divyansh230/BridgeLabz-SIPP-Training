package Basics_Built_In_Function;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateComparison {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter date");
        String date = sc.nextLine();
        System.out.println("Enter date");
        String date2 = sc.nextLine();
        
        LocalDate date1 = LocalDate.parse(date, dtf);
        LocalDate date3=LocalDate.parse(date2,dtf);
        
        if(date1.isBefore(date3)) {
            System.out.println("The first Date is before the second date");
        } else if (date1.isAfter(date3)) {
            System.out.println("The first Date is after the second date");
        }
         else{
            System.out.println("The second Date is equal to the first Date");
        }
    }
}
