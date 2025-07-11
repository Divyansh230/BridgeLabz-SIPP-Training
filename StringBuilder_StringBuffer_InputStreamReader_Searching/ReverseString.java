package StringBuilder_StringBuffer_InputStreamReader_Searching;

import java.util.*;
public class ReverseString {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		System.out.println(reverse(s));
	}
	
	static String reverse(String str) {
		StringBuilder sb=new StringBuilder(str);
		
		sb.reverse();
		return sb.toString();
	}
}
