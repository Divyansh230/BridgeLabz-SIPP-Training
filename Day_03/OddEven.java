package Day_03;

import java.util.*;
public class OddEven {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(i%2==0?i+" ":"");
		}
		System.out.println();
		for(int i=1;i<=n;i+=2) {
			System.out.print(i+" ");
		}
	}
}
