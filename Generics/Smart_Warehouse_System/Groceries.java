package Smart_Warehouse_System;

public class Groceries extends WarehouseItem{

	public Groceries(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return "Groceries";
	}

}
