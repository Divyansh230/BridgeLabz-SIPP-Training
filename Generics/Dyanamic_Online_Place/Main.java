package Dyanamic_Online_Place;

public class Main {
    public static void main(String[] args) {
        // Creating category instances
        BookCategory fiction = new BookCategory("Fiction");
        ClothingCategory mensWear = new ClothingCategory();
        GadgetCategory mobile = new GadgetCategory("Smartphone");

        // Creating product instances
        Product<BookCategory> book = new Product<>("The Alchemist", 499, fiction);
        Product<ClothingCategory> shirt = new Product<>("Formal Shirt", 1299, mensWear);
        Product<GadgetCategory> phone = new Product<>("Samsung Galaxy", 64999, mobile);

        // Applying discounts
        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(phone, 5);

        // Adding to catalog
        ProductCatalog catalog = new ProductCatalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        // Display
        System.out.println("\n=== Marketplace Catalog ===");
        catalog.displayAllProducts();
    }
}

