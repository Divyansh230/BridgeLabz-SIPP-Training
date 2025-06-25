package OOPS_Programming2;

public class Product {
    static int discount =15;
    String productName;
    double price;
    int quantity;
    final String prductID;
    Product(String productName, double price, int quantity, String prductID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.prductID = prductID;
    }

    static void updateDiscount(int newDiscount) {
        discount = newDiscount;
    }
    void displayProductDetails() {
        if(this instanceof Product){
            System.out.println("Product Name: "+productName);
            System.out.println("Product Price: "+price);
            System.out.println("Product Quantity: "+quantity);
            System.out.println("Product ID: "+prductID);
        }
        else{
            System.out.println("Product Name: "+productName);
        }
    }

    public static void main(String[] args) {
        Product product=new Product("Mobile",32000.00,45,"Alpha-779");
        product.displayProductDetails();
    }
}
