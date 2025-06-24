package OOPS_Programming;

import java.util.Scanner;

public class Circumference {
    int radius;

    Circumference(int radius) {
        this.radius = radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circumference circum = new Circumference(sc.nextInt());
        double c=circum.getCircumference();
        System.out.println("The circumference is " + c);
    }
}
