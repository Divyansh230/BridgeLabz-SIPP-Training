package Smart_Warehouse_System;

public class Electronics extends WarehouseItem{

	public Electronics(String name, double price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return "Electronics";
	}
	
}
