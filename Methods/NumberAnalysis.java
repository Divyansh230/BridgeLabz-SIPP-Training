package Methods;
import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if (isPositive(num)) {
                if (isEven(num)) {
                    System.out.println(num + " is positive and even");
                } else {
                    System.out.println(num + " is positive and odd");
                }
            } else {
                System.out.println(num + " is negative");
            }
        }

        int cmp = compare(arr[0], arr[arr.length - 1]);
        if (cmp == 1) {
            System.out.println("First element is greater than last element");
        } else if (cmp == 0) {
            System.out.println("First element is equal to last element");
        } else {
            System.out.println("First element is less than last element");
        }

        sc.close();
    }

    static boolean isPositive(int num) {
        return num >= 0;
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        if (number1 == number2) return 0;
        return -1;
    }
}
