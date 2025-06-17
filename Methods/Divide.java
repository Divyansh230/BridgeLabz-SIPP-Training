package Methods;
import java.util.Arrays;
import java.util.Scanner;
public class Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend=sc.nextInt();
        int divisor=sc.nextInt();

        int ans[]=divide(dividend,divisor);
        System.out.println(Arrays.toString(ans));
    }

    static int[] divide(int dividend,int divisor){
        return new int[]{dividend/divisor,dividend%divisor};
    }
}
