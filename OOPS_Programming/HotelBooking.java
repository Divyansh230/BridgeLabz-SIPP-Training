package OOPS_Programming;

import java.util.Scanner;
public class HotelBooking {
    String guestName;
    String roomtype;
    String nights;

    HotelBooking(String guestName, String roomtype, String nights) {
        this.guestName = guestName;
        this.roomtype = roomtype;
        this.nights = nights;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelBooking hotel=new HotelBooking(sc.next(),sc.next(),sc.next());

        System.out.println(hotel.guestName
        + " " + hotel.roomtype);

    }
}
