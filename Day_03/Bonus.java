package Day_03;

import java.util.*;
public class Bonus {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int year=sc.nextInt();
		int salary=sc.nextInt();
		if(year>=5) {
			System.out.println("New Salary of the Employee is "+((salary*0.05)+salary));
		}
		else {
			System.out.println("No Bonus");
		}
	}
}
