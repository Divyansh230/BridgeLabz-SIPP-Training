package Object_Oriented_Programming;

import java.util.Scanner;

public class Item {
    private int itemcode;
    private String itemname;
    private double price;

    public Item(int itemcode, String itemname, double price) {
        this.itemcode=itemcode;
        this.itemname=itemname;
        this.price=price;
    }
    void display_details() {
        System.out.println("Item Code : " + itemcode);
        System.out.println("Item Name : " + itemname);
        System.out.println("Item Price : " + price);
    }
    double getTotalCost(int quantity) {
        int cost=0;
        return this.price*quantity;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int itemcode=sc.nextInt();
        String itemname=sc.next();
        double price=sc.nextDouble();
        Item item=new Item(itemcode,itemname,price);
        item.display_details();
        System.out.println("Total Cost:"+item.getTotalCost(5));
    }
}
