package OOPS_Programming;

import java.util.Scanner;

public class LibraryBookingSystem {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBookingSystem(String title, String author, double price, boolean available) {
        this.title=title;
        this.author=author;
        this.price=price;
        this.available=available;
    }
    String getTitle() {
        return title;
    }
    String getAuthor() {
        return author;
    }
    double getPrice() {
        return price;
    }
    boolean isAvailable() {
        return available;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LibraryBookingSystem ob=new LibraryBookingSystem(sc.next(),sc.next(),sc.nextDouble(),sc.nextBoolean());
        System.out.println(ob.getTitle());
        System.out.println(ob.getAuthor());
        System.out.println(ob.getPrice());
        System.out.println(ob.isAvailable());


    }
}
