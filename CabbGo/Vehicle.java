package CabbGo;

public abstract class Vehicle {
	
	protected String vehicleNumber;
	protected int capacity;
	protected String type;
	
	public Vehicle(String vehicleNumber,int capacity,String type) {
		this.vehicleNumber=vehicleNumber;
		this.capacity=capacity;
		this.type=type;
	}
	
	public abstract double calculateFare(double distance);
	
	public String getVehicleNumber() {
		return this.vehicleNumber;
	}
	
	public int getCapacity() {
		return this.capacity;
	}
	
	public String getType() {
		return this.type;
	}
}
