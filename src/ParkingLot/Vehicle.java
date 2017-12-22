package ParkingLot;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Vehicle {
    protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<>();
    protected String licensePlate;
    protected int spotsNeeded;
    protected Type type;

    public int getSpotsNeeded() {
        return spotsNeeded;
    }


    // park a vehicle in this spot
    public void parkInSpot(ParkingSpot s) {
    }

    public void clearSpots() {

    }

    /**
     * check if the spot is
     */

    public abstract boolean canFit(ParkingSpot spot);
}
