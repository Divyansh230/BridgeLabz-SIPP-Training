package Regex;

import java.util.regex.*;
import java.util.*;

public class RepeatingWordsFinder {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";

        // Regex: capture a word, followed by same word again
        String regex = "\\b(\\w+)\\b\\s+\\1\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        Set<String> repeatingWords = new LinkedHashSet<>(); // preserve order, avoid duplicates

        while (matcher.find()) {
            repeatingWords.add(matcher.group(1)); // group(1) = the repeated word
        }

        // Print repeating words
        System.out.println(String.join(", ", repeatingWords));
    }
}
