package Basics_Built_In_Function;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
public class DateArithmatic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter date (dd-MM-yyyy: ");
        String inputdate = sc.nextLine();

        LocalDate date=LocalDate.parse(inputdate, dtf);

        LocalDate updatedDate=date.plusDays(7).plusMonths(1).plusYears(2);
        updatedDate=updatedDate.minusWeeks(3);
        System.out.println("Final date after operation:"+updatedDate.format(dtf));
    }
}
