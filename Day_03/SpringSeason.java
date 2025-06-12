package Day_03;

import java.util.*;
public class SpringSeason {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int month=sc.nextInt();
		int day=sc.nextInt();
		
		if(month>3 && month<6) {
			System.out.println("It is a Spring Season");
		}
		
		else if(month==4 || month==5) {
			if(day<20)System.out.println("It is not a Spring Season");
		}
		else {
			System.out.println("It is not a Spring Season");
		}
	}
	
}
