package Smart_Warehouse_System;

public class Furniture extends WarehouseItem{

	public Furniture(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return "Furniture";
	}

}
