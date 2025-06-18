package Strings_and_Exceptional_Handling;

import java.util.Scanner;

public class IllegalArgumentDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();

        // This method will generate the exception (abrupt termination)
        generateException(input);

        // This method will handle the exception properly
        handleException(input);

        sc.close();
    }

    // Method to generate the IllegalArgumentException without handling
    public static void generateException(String str) {
        System.out.println("\n--- Generating Exception ---");
        // This will cause an IllegalArgumentException because start > end
        String subStr = str.substring(5, 2); // Intentionally wrong
        System.out.println("Substring: " + subStr);
    }

    // Method to handle the exception using try-catch
    public static void handleException(String str) {
        System.out.println("\n--- Handling Exception ---");
        try {
            String subStr = str.substring(5, 2); // Intentionally wrong
            System.out.println("Substring: " + subStr);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) { // Generic RuntimeException
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
