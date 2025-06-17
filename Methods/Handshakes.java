package Methods;
import java.util.Scanner;
public class Handshakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        Handshakes h=new Handshakes();
        System.out.println("All possible Handshakes are "+h.shake(n));
    }

    int shake(int n){
        return (n*(n+1)/2);
    }
}
