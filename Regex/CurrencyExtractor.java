package Regex;

//package Regex;

import java.util.regex.*;
import java.util.*;

public class CurrencyExtractor {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        // Regex: optional $, digits, optional decimal part
        String regex = "\\$?\\d+(\\.\\d{2})?";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        List<String> values = new ArrayList<>();

        while (matcher.find()) {
            values.add(matcher.group());
        }

        // Print extracted currency values
        System.out.println(String.join(", ", values));
    }
}

