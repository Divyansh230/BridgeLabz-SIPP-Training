package Strings_and_Exceptional_Handling;

import java.util.Scanner;

public class VowelsConsonantsCharacterType {

    // Method to check if char is vowel, consonant or not a letter
    public static String checkCharType(char ch) {
        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }

    // Method to find vowels and consonants in string and return 2D array: [char, type]
    public static String[][] analyzeString(String text) {
        int length = text.length();
        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }
        return result;
    }

    // Method to display 2D String array in tabular format
    public static void displayResults(String[][] arr) {
        System.out.printf("%-10s | %-12s\n", "Character", "Type");
        System.out.println("-------------------------");
        for (String[] row : arr) {
            System.out.printf("%-10s | %-12s\n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] analysis = analyzeString(input);
        displayResults(analysis);

        sc.close();
    }
}

