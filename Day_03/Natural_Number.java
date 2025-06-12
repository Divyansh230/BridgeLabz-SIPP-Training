package Day_03;

import java.util.*;
public class Natural_Number {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		if(n<0) {
			System.out.println("The number is not a Natural Number");
		}
		int sum=(n*(n+1))/2;
		System.out.println("The sum of "+n+" Natural number is "+sum);
	}
}
