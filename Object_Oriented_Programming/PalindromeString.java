package Object_Oriented_Programming;

import java.util.Scanner;

public class PalindromeString {
    String text;
    public PalindromeString(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String ans="";
        for(int i=0; i<text.length(); i++) {
            ans=text.charAt(i)+ans;
        }
        return ans.equals(text);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        PalindromeString p = new PalindromeString(text);
        System.out.println(p.isPalindrome());
    }
}
