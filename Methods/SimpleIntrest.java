package Methods;
import java.util.Scanner;
public class SimpleIntrest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        SimpleIntrest ob=new SimpleIntrest();
        System.out.println("The Simple Interest is"+ob.intrest(p,r,t)+" for Principal "+p+" Rate of Interest " +r+" and Time ");
    }

    int intrest(int p,int r,int t){
        return (p*r*t)/100;
    }
}
