package Strings_and_Exceptional_Handling;

import java.util.Scanner;

public class VowelsConsonantsCounter {

    // Method to check if a character is vowel, consonant or not a letter
    public static String checkCharType(char ch) {
        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32);
        }

        // Check vowels
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }

        // Check consonants (letters other than vowels)
        if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }

        // Not a letter
        return "Not a Letter";
    }

    // Method to count vowels and consonants in a string
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        int length = text.length();

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            String type = checkCharType(ch);

            if (type.equals("Vowel")) {
                vowels++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        int[] counts = countVowelsConsonants(input);

        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);

        sc.close();
    }
}

