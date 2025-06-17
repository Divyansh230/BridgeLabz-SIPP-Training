package Methods;
import java.util.*;
public class Sum_of_Natural {
    public static void main(String[] args) {
        Sum_of_Natural obj=new Sum_of_Natural();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Sum of natural numbers between 1 and "+n+" are : "+obj.sum(n));
    }

    int sum(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        return sum;
    }
}
