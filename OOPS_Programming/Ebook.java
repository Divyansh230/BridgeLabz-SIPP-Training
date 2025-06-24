package OOPS_Programming;

public class Ebook extends Books {
    private double fileSizeMB;

    // Constructor
    Ebook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }

    // Method to display EBook-specific details
    public void displayEBookDetails() {
        System.out.println("E-Book ISBN: " + ISBN);       // public - accessible here
        System.out.println("E-Book Title: " + title);     // protected - accessible in subclass
        System.out.println("File Size (MB): " + fileSizeMB);
    }
    public static void main(String[] args) {
        // Create Book Object
        Books book = new Books("978-0134685991", "Effective Java", "Joshua Bloch");
        book.displayDetails();

        // Access and modify private 'author' using public methods
        book.setAuthor("J. Bloch");
        System.out.println("Updated Author: " + book.getAuthor());

        System.out.println("\n----- E-Book Details -----");
        // Create EBook Object
        Ebook ebook = new Ebook("978-1491950357", "Learning Java", "Marc Loy", 5.4);
        ebook.displayEBookDetails();

        // Access private 'author' of superclass via public method
        System.out.println("E-Book Author: " + ebook.getAuthor());
    }
}
