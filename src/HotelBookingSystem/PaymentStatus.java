package HotelBookingSystem;

public enum PaymentStatus {
    PAID("Paid"),
    UNPAID("Unpaid");
    private final String name;
    private PaymentStatus(String name) {
        this.name = name;
    }
}
