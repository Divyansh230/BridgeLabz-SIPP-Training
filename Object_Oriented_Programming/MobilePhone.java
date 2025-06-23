package Object_Oriented_Programming;

import java.util.Scanner;

public class MobilePhone {
    private String brand;
    private String model;
    private long price;

    public MobilePhone(String brand, String model, long price) {
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    void display_details(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the brand: ");
        String brand=sc.nextLine();
        System.out.println("Enter the model: ");
        String model=sc.nextLine();
        System.out.println("Enter the price: ");
        long price=sc.nextLong();
        MobilePhone m=new MobilePhone(brand,model,price);
        m.display_details();

    }
}
