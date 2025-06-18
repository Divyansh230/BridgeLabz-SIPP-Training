package Strings_and_Exceptional_Handling;

import java.util.Scanner;

public class StringLengthFinder {

    // Method to find string length without using length() method
    public static int findLengthWithoutLengthMethod(String text) {
        int count = 0;

        try {
            while (true) { // Infinite loop to count characters
                text.charAt(count); // Will throw exception when index exceeds
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception will occur when index is out of range
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Call user-defined method
        int lengthWithoutMethod = findLengthWithoutLengthMethod(text);

        // Use built-in length() method
        int lengthWithMethod = text.length();

        // Display both results
        System.out.println("\nLength without using length() method: " + lengthWithoutMethod);
        System.out.println("Length using length() method: " + lengthWithMethod);

        sc.close();
    }
}

