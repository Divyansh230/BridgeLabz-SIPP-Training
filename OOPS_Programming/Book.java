package OOPS_Programming;

import java.util.Scanner;

public class Book {
    String title;
    String author;
    double price;

    Book(){}
    Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void display(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book book = new Book();
        System.out.println("Enter the title: ");
        book.title = sc.nextLine();
        System.out.println("Enter the author: ");
        book.author = sc.nextLine();
        System.out.println("Enter the price: ");
        book.price = sc.nextDouble();
        book.display();
    }
}
