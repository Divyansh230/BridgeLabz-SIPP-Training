package Regex;

import java.util.regex.*;
import java.util.*;

public class LinkExtractor {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";

        // Regex for extracting links (http/https + domain)
        String regex = "\\bhttps?://[\\w.-]+(?:\\.[a-z]{2,})(?:/[\\w./?%&=-]*)?\\b";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);

        List<String> links = new ArrayList<>();

        while (matcher.find()) {
            links.add(matcher.group());
        }

        // Print extracted links
        System.out.println(String.join(", ", links));
    }
}
