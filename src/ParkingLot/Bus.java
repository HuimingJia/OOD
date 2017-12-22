package ParkingLot;

public class Bus extends Vehicle {

    public Bus() {
        spotsNeeded = 1;
        type = Type.CAR;
    }
    @Override
    public boolean canFit(ParkingSpot spot) {
        return false;
    }
}
