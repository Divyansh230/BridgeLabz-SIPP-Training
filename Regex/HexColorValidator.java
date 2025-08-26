package Regex;



import java.util.Scanner;
import java.util.regex.Pattern;

public class HexColorValidator {
    private static final Pattern HEX_COLOR = Pattern.compile("^#[A-Fa-f0-9]{6}$");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();

        if (HEX_COLOR.matcher(input).matches()) {
            System.out.println(input + " → ✅ Valid Hex Color");
        } else {
            System.out.println(input + " → ❌ Invalid Hex Color");
        }
        sc.close();
    }
}

