package Dyanamic_Online_Place;

public class Product <T extends Category>{
	private String name;
	private double price;
	private T category;
	
	public Product(String name,double price,T category) {
		this.name=name;
		this.price=price;
		this.category=category;
	}
	
	public String getname() {
		return name;
	}
	
	public double getprice() {
		return price;
	}
	
	public T category() {
		return category;
	}
	
	public void setPrice(double newPrice) {
		this.price=newPrice;
	}
	
  public void displayProduct() {
        System.out.println(name + " | " + category.getCategory() + " | ₹" + price);
    }
}
