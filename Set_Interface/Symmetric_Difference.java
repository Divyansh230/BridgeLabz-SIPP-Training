package Set_Interface;

import java.util.*;
public class Symmetric_Difference {
	
	public static void main(String args[]) {
		Set<Integer> set1=new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> set2=new HashSet<>(Arrays.asList(3,4,5));
		
		Set<Integer>union=new HashSet<>(set1);
		union.addAll(set2);
		Set<Integer>intersetion=new HashSet<>(set2);
		intersetion.retainAll(set1);
		union.removeAll(intersetion);
		System.out.println(union);
	}
}
