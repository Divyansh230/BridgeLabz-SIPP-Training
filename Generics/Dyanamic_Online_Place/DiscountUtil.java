package Dyanamic_Online_Place;

public class DiscountUtil {
    public static <T extends Category> void applyDiscount(Product<T> product, double percentage) {
        double discountedPrice = product.getprice() * (1 - percentage / 100.0);
        product.setPrice(discountedPrice);
        System.out.println("Applied " + percentage + "% discount to " + product.getname());
    }
}

