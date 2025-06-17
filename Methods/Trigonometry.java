package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Trigonometry {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double angle=sc.nextDouble();
        angle=Math.toRadians(angle);

        System.out.println(Arrays.toString(print(angle)));
    }
    public static double[] print(double angle){
        return new double[]{Math.sin(angle),Math.cos(angle),Math.cos(angle)};
    }
}
