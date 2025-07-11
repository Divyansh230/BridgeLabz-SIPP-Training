package CabbGo;

public class Driver {
	
	private String name;
	private String licenseNumber;
	private double rating;
	
	public Driver(String name,String licenseNumber,double rating) {
		this.name=name;
		this.licenseNumber=licenseNumber;
		this.rating=rating;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getLiscenseNumber() {
		return this.licenseNumber;
	}
	
	public double getRating() {
		return this.rating;
	}
}
