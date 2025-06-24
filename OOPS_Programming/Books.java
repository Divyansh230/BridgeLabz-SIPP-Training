package OOPS_Programming;



public class Books {
    public String ISBN;       // Public - accessible everywhere
    protected String title;   // Protected - accessible in same package or subclass
    private String author;    // Private - accessible only within this class

    // Constructor
    Books(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Public Setter for author (to modify private member)
    public void setAuthor(String author) {
        this.author = author;
    }

    // Public Getter for author (to access private member)
    public String getAuthor() {
        return author;
    }

    // Display method to show book details
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

