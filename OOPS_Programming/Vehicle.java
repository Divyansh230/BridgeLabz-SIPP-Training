package OOPS_Programming;

class Vehicle {
    // Class Variable (Static) - Shared by all instances
    static double registrationFee = 5000.0;

    // Instance Variables - Unique for each instance
    String ownerName;
    String vehicleType;

    // Constructor
    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method - Displays individual vehicle details
    void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: ₹" + registrationFee);
    }

    // Class Method (Static Method) - Updates the registration fee for all vehicles
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration Fee Updated to: ₹" + registrationFee);
    }
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Amit Kumar", "Car");
        Vehicle vehicle2 = new Vehicle("Priya Sharma", "Bike");

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();

        // Update Registration Fee using Class Method
        Vehicle.updateRegistrationFee(6000);

        System.out.println("\nAfter Updating Registration Fee:");

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
    }
}
