package Strings_and_Exceptional_Handling;
import java.util.Scanner;

public class SubstringComparison {

    // Method to create a substring using charAt()
    public static String createSubstringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings character by character using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the text: ");
        String text = sc.next();

        System.out.print("Enter the start index: ");
        int start = sc.nextInt();

        System.out.print("Enter the end index: ");
        int end = sc.nextInt();

        // Create substring using charAt()
        String substringCharAt = createSubstringUsingCharAt(text, start, end);
        System.out.println("Substring using charAt(): " + substringCharAt);

        // Create substring using built-in substring() method
        String substringBuiltIn = text.substring(start, end);
        System.out.println("Substring using substring() method: " + substringBuiltIn);

        // Compare both substrings
        boolean isEqual = compareStrings(substringCharAt, substringBuiltIn);
        System.out.println("Are both substrings equal? " + isEqual);

        sc.close();
    }
}
