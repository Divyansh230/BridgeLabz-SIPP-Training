package Strings_and_Exceptional_Handling;

import java.util.Scanner;

public class WordLengthTable {

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

        // Count the number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store the indexes of spaces
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

        // Extract the last word
        String lastWord = "";
        for (int j = start; j < length; j++) {
            lastWord += text.charAt(j);
        }
        words[wordIndex] = lastWord;

        return words;
    }

    // Method to create a 2D String array with word and its length
    public static String[][] getWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i]; // word
            int wordLength = findLengthWithoutLengthMethod(words[i]); // length without using length()
            wordLengthArray[i][1] = String.valueOf(wordLength); // store as string
        }

        return wordLengthArray;
    }

    // Method to display the word-length table
    public static void displayTable(String[][] wordLengthArray) {
        System.out.printf("%-15s %-10s\n", "Word", "Length");
        System.out.println("----------------------------");

        for (String[] row : wordLengthArray) {
            String word = row[0];
            int length = Integer.parseInt(row[1]); // convert string back to integer
            System.out.printf("%-15s %-10d\n", word, length);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Process the sentence
        String[] words = manualSplit(text);
        String[][] wordLengthArray = getWordLengthArray(words);

        // Display results
        displayTable(wordLengthArray);

        sc.close();
    }
}

