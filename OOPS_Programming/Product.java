package OOPS_Programming;
import java.util.Scanner;
public class Product {
    static int totalProducts=0;

    String productName;
    double price;
    Product(String productName, double price) {
        this.productName=productName;
        this.price=price;
        totalProducts++;
    }

    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
    }

    // Class Method (Static Method)
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the product name: ");
        String productName=sc.nextLine();
        System.out.println("Enter the product price: ");
        double price=sc.nextDouble();
        Product obj=new Product(productName,price);
        obj.displayProductDetails();
        obj.displayTotalProducts();
    }
}
