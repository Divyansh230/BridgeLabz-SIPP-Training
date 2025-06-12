package Day_03;

import java.util.*;
public class Smallest {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if(n1<n2 && n1<n3) {
			System.out.println("Yes the first number is greater than both of the two number");
		}
		else {
			System.out.println("No, First number is not greater than the both of the number");
		}
	}
}
