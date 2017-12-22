package HotelBookingSystem;

import java.sql.Time;
import java.util.List;

public class Booking {
    int bookingId;
    int userId;
    int hotelId;
    List<Room> bookedRooms;
    int amount;
    PaymentStatus status_of_payment;
    Time bookingTime;
    Duration duration;
}
