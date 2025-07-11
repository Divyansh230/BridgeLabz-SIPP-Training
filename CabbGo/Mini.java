package CabbGo;

public class Mini extends Vehicle{
	
	private final double base_fare=50;
	private final double rate=50;
	
	public Mini(String vehicleNumber, int capacity) {
		super(vehicleNumber, capacity, "Mini");
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateFare(double distance) {
		// TODO Auto-generated method stub
		return base_fare+distance*100;
	}

}
