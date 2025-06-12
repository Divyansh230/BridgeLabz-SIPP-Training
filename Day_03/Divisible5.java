package Day_03;

import java.util.*;
public class Divisible5 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		if(n%5==0) {
			System.out.println("The number is divisble by 5");
		}
		else {
			System.out.println("The number is not divisible by 5");
		}
	}
}
