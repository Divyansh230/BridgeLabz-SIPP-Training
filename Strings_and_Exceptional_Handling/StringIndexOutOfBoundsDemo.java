package Strings_and_Exceptional_Handling;

import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException (unhandled)
    public static void generateException(String text) {
        System.out.println("\nGenerating StringIndexOutOfBoundsException...");
        // Accessing index beyond the string length to cause exception
        System.out.println("Accessing character at index 10: " + text.charAt(10));
    }

    // Method to handle StringIndexOutOfBoundsException using try-catch
    public static void handleException(String text) {
        System.out.println("\nDemonstrating Exception Handling...");
        try {
            // Trying to access index beyond string length
            System.out.println("Accessing character at index 10: " + text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
        System.out.println("Program continues after handling the exception.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input for the string
        System.out.print("Enter a string: ");
        String text = sc.next();

        // First, call the method that will generate an unhandled exception
        // Uncomment below line to see abrupt termination
        // generateException(text);

        // Call the method that handles the exception properly
        handleException(text);

        sc.close();
    }
}
