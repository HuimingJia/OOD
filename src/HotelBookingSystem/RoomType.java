package HotelBookingSystem;

public enum  RoomType {
    SINGLE("Single"),
    DOUBLE("Double"),
    TRIPLE("Triple");

    private final String name;

    private RoomType(String name) {
        this.name = name;
    }
}
