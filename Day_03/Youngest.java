package Day_03;

import java.util.*;
public class Youngest {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int amar=sc.nextInt();
		int akbar=sc.nextInt();
		int anthony=sc.nextInt();
		
		System.out.println(Math.min(amar, Math.min(anthony, akbar)));
	}

}
