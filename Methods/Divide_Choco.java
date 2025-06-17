package Methods;

import java.util.Scanner;

public class Divide_Choco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfChocolates = sc.nextInt();
        int numberOfChildren = sc.nextInt();

        int[] result = distributeChocolates(numberOfChocolates, numberOfChildren);

        System.out.println("Chocolates per child: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);
    }

    public static int[] distributeChocolates(int chocolates, int children) {
        int perChild = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{perChild, remaining};
    }
}
