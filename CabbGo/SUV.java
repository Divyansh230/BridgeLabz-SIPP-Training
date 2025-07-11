package CabbGo;

public class SUV extends Vehicle{

	public SUV(String vehicleNumber, int capacity) {
		super(vehicleNumber, capacity, "SUV");
		// TODO Auto-generated constructor stub
	}
	private final double base_fare=150;
	private final double rate=50;
	@Override
	public double calculateFare(double distance) {
		// TODO Auto-generated method stub
		return base_fare+distance*rate;
	}
	
	
}
