package CabbGo;

public class RideServices implements IdRideService{
	private Vehicle vehicle;
	private Driver driver;
	private String currentUser;
	private double distance;
	private double fare;
	
	public RideServices(Vehicle vehicle,Driver driver) {
		this.driver=driver;
		this.vehicle=vehicle;
	}

	@Override
	public void bookRide(String user, double distance) {
		// TODO Auto-generated method stub
		this.currentUser=user;
		this.distance=distance;
		this.fare=vehicle.calculateFare(distance);
		
		System.out.println("Ride is Confirmed for: "+user);
		System.out.println("Vehicle type: "+vehicle.getType()+" Driver: "+driver.getName());
	}

	@Override
	public void endRide() {
		// TODO Auto-generated method stub
		System.out.println("Ride is being Ended , Distance:"+distance+" total Fare "+getFare());
	}
	public double getFare() {
		return fare;
	}
	
	public void resetRide() {
		currentUser=null;
		distance=0;
		fare=0;
	}
	
}
