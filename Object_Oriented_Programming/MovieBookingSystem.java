package Object_Oriented_Programming;

import java.util.Scanner;

class MovieTicket {
    // Attributes
    String movieName;
    int seatNumber;
    double price;
    boolean isBooked;

    // Constructor
    MovieTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        this.isBooked = false;
    }

    // Method to book a ticket
    void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket booked successfully for " + movieName + " | Seat No: " + seatNumber);
        } else {
            System.out.println("Sorry! Seat No " + seatNumber + " is already booked.");
        }
    }

    // Method to display ticket details
    void displayTicketDetails() {
        System.out.println("----- Ticket Details -----");
        System.out.println("Movie Name : " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price      : ₹" + price);
        System.out.println("Status     : " + (isBooked ? "Booked" : "Available"));
        System.out.println("--------------------------");
    }
}

public class MovieBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example setup of a few tickets
        MovieTicket[] tickets = {
                new MovieTicket("Avengers: Endgame", 1, 250.0),
                new MovieTicket("Avengers: Endgame", 2, 250.0),
                new MovieTicket("Avengers: Endgame", 3, 250.0)
        };

        System.out.println("Welcome to the Movie Ticket Booking System!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Display Available Tickets");
            System.out.println("2. Book a Ticket");
            System.out.println("3. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    for (MovieTicket ticket : tickets) {
                        ticket.displayTicketDetails();
                    }
                    break;
                case 2:
                    System.out.print("Enter seat number to book: ");
                    int seatNo = sc.nextInt();
                    boolean found = false;
                    for (MovieTicket ticket : tickets) {
                        if (ticket.seatNumber == seatNo) {
                            ticket.bookTicket();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Invalid seat number.");
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using the Movie Ticket Booking System.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
