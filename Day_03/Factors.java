package Day_03;
import java.util.*;
public class Factors {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.print(n%i==0?i+" ":"");
		}
	}
}
