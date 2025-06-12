package Day_03;

import java.util.*;
public class FizzBuzz {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0) {
			System.exit(0);
		}
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5!=0) {
				System.out.println("FIZZ");
			}
			else if(i%3!=0 && i%5==0) {
				System.out.println("BUZZ");
			}
			else if(i%3==0 && i%5==0) {
				System.out.println("FIZZBUZZ");
			}
			else {
				System.out.println(i);
			}
		}
	}
}
