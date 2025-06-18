package Strings_and_Exceptional_Handling;

import java.util.Scanner;

public class StringSplitComparison {

    // Method to find string length without using length() method
    public static int findLengthWithoutLengthMethod(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split text into words without using split()
    public static String[] manualSplit(String text) {
        int length = findLengthWithoutLengthMethod(text);
        int wordCount = 1;

        // Counting number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Storing indexes of spaces
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

        // Extract words based on space indexes
        String[] words = new String[wordCount];
        int start = 0;
        int wordIndex = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            int end = spaceIndexes[i];
            String word = "";
            for (int j = start; j < end; j++) {
                word += text.charAt(j);
            }
            words[wordIndex++] = word;
            start = end + 1;
        }

        // Extracting the last word
        String lastWord = "";
        for (int j = start; j < length; j++) {
            lastWord += text.charAt(j);
        }
        words[wordIndex] = lastWord;

        return words;
    }

    // Method to compare two string arrays word by word
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input as a full sentence
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Manual split
        String[] manualWords = manualSplit(text);

        // Built-in split
        String[] builtInWords = text.split(" ");

        // Compare both arrays
        boolean isSame = compareStringArrays(manualWords, builtInWords);

        // Display results
        System.out.println("\nWords from manual split:");
        for (String word : manualWords) {
            System.out.println(word);
        }

        System.out.println("\nWords from built-in split:");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("\nAre both split results the same? " + isSame);

        sc.close();
    }
}

