package List_Interface;

import java.util.*;
public class Reverse_List {
	
	public static <T> void reverse_ArrayList(ArrayList<T> arr) {
		int start=0;
		int end=arr.size()-1;
		while(start<=end) {
			swap(arr,start,end);
			start++;
			end--;
		}
	}
	private static <T>void swap(ArrayList<T>arr,int i,int j){
		T t=arr.get(i);
		arr.set(i, arr.get(j));
		arr.set(j,t);
	}
	
	public static <T> void reverse_LinkedList(LinkedList<T> ll) {
		int start=0;
		int end=ll.size()-1;
		while(start<=end) {
			swap(ll,start,end);
			start++;
			end--;
		}
	}
	private static <T> void swap(LinkedList<T>ll,int i,int j) {
		T t=ll.get(i);
		ll.set(i, ll.get(j));
		ll.set(j,t);
	}
	
	public static void main(String args[]) {
		ArrayList<Integer> arr=new ArrayList<>();
		
		for(int i=1;i<=5;i++) {
			arr.add(i);
		}
		
		System.out.println("Original ArrayList: "+arr);
		reverse_ArrayList(arr);
		System.out.println("Sorted ArrayList: "+arr);
		
		LinkedList<Integer> ll=new LinkedList<>();
		for(int i=1;i<=5;i++) {
			ll.add(i);
		}
		
		System.out.println("Original LinkedList:"+ll);
		reverse_LinkedList(ll);
		System.out.println("Reversed LinkedList:"+ll);
	}
}
