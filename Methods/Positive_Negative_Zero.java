package Methods;
import java.util.Scanner;
public class Positive_Negative_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(positive_negative_zero(n));
    }

    static String positive_negative_zero(int n) {
        if(n==0)return "0";
        if(n<1)return "Negative Number";
        return "Positive Number";
    }
}
