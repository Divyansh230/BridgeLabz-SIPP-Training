package List_Interface;

import java.util.*;


public class Element_Frequency {
	
	

	public static <T> Map<T,Integer> freq(List<T> arr){
		Map<T,Integer> map=new HashMap<>();
		for(T i:arr) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		return map;
	}
	
	public static void main(String args[]) {
		List<String> list=new ArrayList<>();
		list.add("Hello");
		list.add("Bye");
		list.add("Bye");
		list.add("Lost");
		list.add("Lost");
		Map<String,Integer> map=freq(list);
		System.out.println(map);
		
	}
}
