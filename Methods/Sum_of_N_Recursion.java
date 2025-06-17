package Methods;
import java.util.Scanner;
public class Sum_of_N_Recursion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum(n)==(n*(n+1)/2));
    }
    static int sum(int n) {
        if(n==0)return 0;
        return n+sum(n-1);
    }
}
