package CabbGo;

public class Main {
	
	public static void main(String args[]) {
		Vehicle myCar = new Sedan("MH12AB1234", 4);
        Driver myDriver = new Driver("Divyansh", "DL-042021", 4.9);

        IdRideService rideService = new RideServices(myCar, myDriver);

        rideService.bookRide("Rahul", 12.5);
        rideService.endRide();
    }
	}

