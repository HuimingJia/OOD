package ParkingLot;

public enum Type {
    MOTORCYCLE("Motorcycle"),
    CAR("Car"),
    BUS("Bus");

    private final String name;


    private Type(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static Type random() {
        int i = (int) (Math.random() * Type.values().length);
        return Type.values()[i];
    }
}
