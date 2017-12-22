package HotelBookingSystem;

public enum RoomStatus {
    EMPTY("Empty"),
    NOT_EMPTY("Not_empty");

    private final String name;


    private RoomStatus(String name) {
        this.name = name;
    }
}
