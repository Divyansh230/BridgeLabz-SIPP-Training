package Strings_and_Exceptional_Handling;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException...");
        // Trying to access an index greater than the array size
        // This will cause the exception and stop the program if not handled
        System.out.println("Accessing names[5]: " + names[5]);  // Error if array length < 6
    }

    // Method to demonstrate exception handling
    public static void handleException(String[] names) {
        System.out.println("\nDemonstrating Exception Handling...");
        try {
            // Trying to access an index greater than the array size
            System.out.println("Accessing names[5]: " + names[5]);  // May throw exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught Generic RuntimeException: " + e.getMessage());
        }
        System.out.println("Program continues after handling the exception.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the array of names
        System.out.print("Enter the number of names: ");
        int size = sc.nextInt();
        sc.nextLine(); // Consume the leftover newline

        String[] names = new String[size];

        System.out.println("Enter the names:");
        for (int i = 0; i < size; i++) {
            names[i] = sc.nextLine();
        }

        // First, call the method that generates an unhandled exception
        // Uncomment the below line to see the abrupt termination (it will stop the program)
        // generateException(names);

        // Second, call the method that demonstrates exception handling
        handleException(names);

        sc.close();
    }
}
