package Day_03;
import java.util.*;
public class GreatestFactor {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int ans=0;
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
			ans=n%i==0?i:0;
		}
		System.out.println(ans);
	}
}
