package Day_03;

import java.util.*;
public class FactorialWhile {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f=1;
		while(n>=1) {
			f=f*n;
			n--;
		}
		System.out.println(f);
	}
}
