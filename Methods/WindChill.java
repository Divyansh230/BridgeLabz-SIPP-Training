package Methods;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        WindChill wc=new WindChill();

        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        int windSpeed=sc.nextInt();

        System.out.println("Wind Chill="+wc.windchill(temp,windSpeed));
    }

    double windchill(int temp,int windSpeed){
        double x=Math.pow(windSpeed,0.16);
        return 35.74*0.6215*temp+(0.4275*temp-35.75)*x;
    }
}
