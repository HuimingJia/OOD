package ParkingLot;

public class Car extends Vehicle {
    public Car() {
        spotsNeeded = 1;
        type = Type.CAR;
    }

    @Override
    public boolean canFit(ParkingSpot spot) {
        return false;
    }
}
