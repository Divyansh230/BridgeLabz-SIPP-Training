package CabbGo;



public class Sedan extends Vehicle{
	
	private final double base_fare=100;
	private final double rate=50;

	public Sedan(String vehicleNumber, int capacity) {
		super(vehicleNumber, capacity, "Sedan");
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateFare(double distance) {
		// TODO Auto-generated method stub
		return base_fare+distance*rate;
	}

}
