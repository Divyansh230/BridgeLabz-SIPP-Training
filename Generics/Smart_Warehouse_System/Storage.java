package Smart_Warehouse_System;

import java.util.*;
public class Storage <T extends WarehouseItem>{
	List<T>items=new ArrayList<>();
	
	public void addItem(T item) {
		items.add(item);
	}
	
	public T getItem(int id) {
		return items.get(id);
	}
	
	public List<T> getAllItems(){
		return items;
	}
}
