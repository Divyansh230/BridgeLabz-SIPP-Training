package Strings_and_Exceptional_Handling;

import java.util.Scanner;

public class ShortestLongestWords {

    // Find length without using length()
    public static int findLengthWithoutLengthMethod(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Split text into words without using split()
    public static String[] manualSplit(String text) {
        int length = findLengthWithoutLengthMethod(text);
        int wordCount = 1;

        // Count words by counting spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }

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

        // Last word
        String lastWord = "";
        for (int j = start; j < length; j++) {
            lastWord += text.charAt(j);
        }
        words[wordIndex] = lastWord;

        return words;
    }

    // Create 2D array of words and their lengths
    public static String[][] createWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(findLengthWithoutLengthMethod(words[i]));
        }
        return wordLengthArray;
    }

    // Find shortest and longest word indexes in 2D array
    // Return array of two ints: {shortestIndex, longestIndex}
    public static int[] findShortestAndLongest(String[][] wordLengthArray) {
        int shortestIndex = 0;
        int longestIndex = 0;
        int shortestLength = Integer.parseInt(wordLengthArray[0][1]);
        int longestLength = shortestLength;

        for (int i = 1; i < wordLengthArray.length; i++) {
            int currentLength = Integer.parseInt(wordLengthArray[i][1]);
            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestIndex = i;
            }
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestIndex = i;
            }
        }

        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = manualSplit(input);
        String[][] wordLengthArray = createWordLengthArray(words);
        int[] shortestLongest = findShortestAndLongest(wordLengthArray);

        System.out.println("Words and their lengths:");
        System.out.printf("%-15s %-10s\n", "Word", "Length");
        System.out.println("--------------------------");
        for (String[] row : wordLengthArray) {
            System.out.printf("%-15s %-10s\n", row[0], row[1]);
        }

        System.out.println("\nShortest word: " + wordLengthArray[shortestLongest[0]][0] +
                " (Length: " + wordLengthArray[shortestLongest[0]][1] + ")");
        System.out.println("Longest word: " + wordLengthArray[shortestLongest[1]][0] +
                " (Length: " + wordLengthArray[shortestLongest[1]][1] + ")");

        sc.close();
    }
}
