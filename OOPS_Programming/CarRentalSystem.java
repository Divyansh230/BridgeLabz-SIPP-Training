package OOPS_Programming;
import java.util.Scanner;
public class CarRentalSystem {
    String CarModel;
    int rentalDays;

    CarRentalSystem(String CarModel, int rentalDays) {
        this.CarModel=CarModel;
        this.rentalDays=rentalDays;
    }

    String getCarModel() {
        return CarModel;
    }
    int getRentalDays() {
        return rentalDays;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CarRentalSystem ob=new CarRentalSystem(sc.nextLine(),sc.nextInt());
        System.out.println(ob.getCarModel());
        System.out.println(ob.getRentalDays());
    }
}
