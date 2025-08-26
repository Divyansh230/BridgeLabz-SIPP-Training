package Regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UsernameValidator {
    private static final Pattern USERNAME = Pattern.compile("^[A-Za-z][A-Za-z0-9_]{4,14}$");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        if (USERNAME.matcher(input).matches()) {
            System.out.println(input + " → ✅ Valid");
        } else {
            System.out.println(input + " → ❌ Invalid");
        }
        sc.close();
    }
}
