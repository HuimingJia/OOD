package HotelBookingSystem;

import java.util.List;

public class Hotel {
    int hotelId;
    String hotelName;
    Address adress;
    List<Room> rooms; // hotel contains the list of rooms
    float rating;
    Facilities facilities;
}
