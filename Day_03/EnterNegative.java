package Day_03;

import java.util.*;
public class EnterNegative {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int s=0;
		while(true) {
			int a=sc.nextInt();
			if(a<=0)break;
			s+=a;
		}
		System.out.println(s)	;
		
	}
}
