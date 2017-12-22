package ParkingLot;

import javax.lang.model.element.TypeElement;

public class ParkingSpot {
    private Vehicle vehicle;
    private Type type;
    private int row;
    private int spotNumber;
    private Level level;

    public ParkingSpot(Level lvl, int r, int n, Type t){

    }

    public boolean isAvailable() {
        return vehicle == null;
    }

    //check if the spot is big enough and is available
    public boolean canFit(Vehicle vehicle) {
        return vehicle.canFit(this);
    }

    public boolean park(Vehicle v) {
        return true;
    }

    //remove vehicle from spot and notify level that a new spot is avaiable
    public void remove(Vehicle v) {

    }

    public int getRow() {
        return row;
    }

    public int getSpotNumber() {
        return spotNumber;
    }
}
