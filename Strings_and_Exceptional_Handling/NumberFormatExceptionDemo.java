package Strings_and_Exceptional_Handling;

import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException without handling
    public static void generateException(String text) {
        System.out.println("\nGenerating NumberFormatException...");
        // Trying to convert a non-numeric string to integer
        int number = Integer.parseInt(text); // This will throw NumberFormatException if input is not a number
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException using try-catch
    public static void handleException(String text) {
        System.out.println("\nDemonstrating Exception Handling...");
        try {
            // Trying to convert a non-numeric string to integer
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught Generic RuntimeException: " + e.getMessage());
        }
        System.out.println("Program continues after handling the exception.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input as a string
        System.out.print("Enter a text (should be a number): ");
        String text = sc.next();

        // First, call the method that generates the unhandled exception
        // Uncomment below line to see abrupt termination
        // generateException(text);

        // Call the method that demonstrates proper exception handling
        handleException(text);

        sc.close();
    }
}
