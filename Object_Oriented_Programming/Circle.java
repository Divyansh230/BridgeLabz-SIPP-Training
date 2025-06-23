package Object_Oriented_Programming;

import java.util.Scanner;

public class Circle {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double Circumference() {
        return 2 * Math.PI * radius;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius=sc.nextDouble();
        Circle circle=new Circle(radius);
        System.out.println("The circumference of the circle is "+circle.Circumference());
    }
}
