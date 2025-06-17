package Methods;

import java.util.Scanner;

public class TriangularPark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();

        int rounds = calculateRounds(side1, side2, side3);

        System.out.println("Rounds needed: " + rounds);
    }

    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000;
        return (int) Math.ceil(totalDistance / perimeter);
    }
}
