package Strings_and_Exceptional_Handling;
import java.util.Scanner;

public class StringComparison {

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
        // First, check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare each character one by one
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true; // All characters matched
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for two strings
        System.out.print("Enter the first string: ");
        String string1 = sc.next();

        System.out.print("Enter the second string: ");
        String string2 = sc.next();

        // Compare using charAt()
        boolean charAtResult = compareUsingCharAt(string1, string2);

        // Compare using built-in equals() method
        boolean equalsResult = string1.equals(string2);

        // Display the results
        System.out.println("\nComparison using charAt(): " + charAtResult);
        System.out.println("Comparison using equals() method: " + equalsResult);

        // Check if both results are the same
        if (charAtResult == equalsResult) {
            System.out.println("Both comparison methods give the SAME result.");
        } else {
            System.out.println("Comparison methods give DIFFERENT results.");
        }

        sc.close();
    }
}
