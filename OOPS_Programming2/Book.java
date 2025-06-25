package OOPS_Programming2;

public class Book {
    static String LibraryName="Central Library";

    static void DisplayLibraryName(){
        System.out.println(LibraryName);
    }
    final String isbn;

    private String author;
    private String title;

    public Book(String isbn, String author, String title) {
        this.isbn=isbn;
        this.author=author;
        this.title=title;
    }
    public void displayEBookDetails(){
        if(this instanceof Book){
            System.out.println("Book Title : " + title);
            System.out.println("Author     : " + author);
            System.out.println("ISBN       : " + isbn);
        }
        else{
            System.out.println("Book does not exits");
        }

    }
    public static void main(String[] args) {
        // Display the shared library name
        Book.DisplayLibraryName();

        // Create book objects
        Book book1 = new Book("1984", "George Orwell", "ISBN-1234");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "ISBN-5678");

        // Display their details
        System.out.println("\nBook 1 Details:");
        book1.displayEBookDetails();

        System.out.println("\nBook 2 Details:");
        book2.displayEBookDetails();
    }
}
