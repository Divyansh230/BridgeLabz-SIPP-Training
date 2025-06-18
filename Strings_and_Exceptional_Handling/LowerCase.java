package Strings_and_Exceptional_Handling;

import java.util.Scanner;

public class LowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a string:");
            String str = sc.nextLine();
            System.out.println("Lowercase string: " + str.toLowerCase());
        } finally {
            sc.close(); // Always good to close resources
        }
    }
}
