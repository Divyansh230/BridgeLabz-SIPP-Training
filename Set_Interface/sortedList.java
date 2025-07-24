package Set_Interface;
import java.util.*;
public class sortedList {

	public static void main(String args[]) {
		 Set<Integer> set = new HashSet<>(Arrays.asList(5, 3, 9, 1));

	        // Convert to List
	        List<Integer> sortedList = new ArrayList<>(set);

	        // Sort in ascending order
	        Collections.sort(sortedList);

	        System.out.println("Sorted List: " + sortedList);
	}
	
}
