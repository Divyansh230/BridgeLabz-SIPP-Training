package Smart_Warehouse_System;

public abstract class WarehouseItem {
	private String name;
	private double price;
	
	public WarehouseItem(String name,double price) {
		this.name=name;
		this.price=price;
	}
	
	public abstract String getCategory();
	
	public String getname() {
		return this.name;
	}
	public double getprice() {
		return this.price;
	}
	
	public void display() {
		System.out.println("Item Name: "+getname()+"\n"+"double price: "+getprice());
	}
}
