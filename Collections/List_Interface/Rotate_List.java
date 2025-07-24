package List_Interface;

import java.util.*;
public class Rotate_List {
	public static <T> void rotate_List(List<T> list,int k){
		reverse(list,0,k-1);
		reverse(list,k,list.size()-1);
		reverse(list,0,list.size()-1);
	}
	public static <T> void reverse(List<T> list,int start,int end) {
		while(start<end) {
			T t=list.get(start);
			list.set(start, list.get(end));
			list.set(end, t);
			start++;
			end--;
		}
	}
	public static void main(String args[]) {
		List<Integer> list= Arrays.asList(10, 20, 30, 40, 50);
		System.out.println("Original List:"+list);
		rotate_List(list,2);
		System.out.println("Rotated List:"+list);
	}
	
	
}
