package List_Interface;

import java.util.*;
public class Remove_Duplicates {
	
	static <T> List<T> remove_Duplicates(List<T> arrayList) {
		List<T>ans=new ArrayList<>();
		Set<T> set=new HashSet<>();
		
		for(T i:arrayList) {
			if(set.contains(i))continue;
			set.add(i);
			ans.add(i);
		}
		return ans;
	}
	public static void main(String args[]) {
		List<Integer> arr=Arrays.asList(3, 1, 2, 2, 3, 4);
		System.out.println("Original ArrayList:"+arr);;
		arr=remove_Duplicates(arr);
		System.out.println("After Removal:"+arr);
	}
}
