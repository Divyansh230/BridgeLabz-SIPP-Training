package Day_03;

import java.util.*;
public class Integer {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("The number is negative");
		}
		else if(n==0) {
			System.out.println("The number is equal to 0");
		}
		else {
			System.out.println("The number is positive");
		}
	}
}
