package Set_Interface;

import java.util.*;
public class Equality {
	
	public static void main(String args[]) {
		//Set<Integer> set=new HashSet<>();
		 Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
	        Set<Integer> set2 = new HashSet<>(Arrays.asList(5, 4, 3, 2, 1));
	        Set<Integer> set3 = new HashSet<>(Arrays.asList(1, 2, 3));

	        System.out.println("set1 equals set2? " + set1.equals(set2)); // true
	        System.out.println("set1 equals set3? " + set1.equals(set3)); // false
	}
}
