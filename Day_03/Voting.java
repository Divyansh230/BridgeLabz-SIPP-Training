package Day_03;

import java.util.*;
public class Voting {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int age=sc.nextInt();
		if(age<18) {
			System.out.println("The person's age is "+age+"He cann't vote");
		}
		else 
			System.out.println("The person's age is "+age+" He can vote");
	}
}
