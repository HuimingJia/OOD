package ParkingLot;

public class Level {
    private int floor;
    private ParkingSpot[] spots;
    private int availableSpots = 0; // freespot;
    private static final int SPOTS_PER_ROW = 10;

    public Level(int floor, int numOfSpots) {
        this.floor = floor;
    }

    public int availableSpots() {
        return availableSpots;
    }

    // find a park spot in this level
    public boolean parkVechile (Vehicle vehicle) {return true; }

    //
    private boolean parkStartingAtSpot(int num, Vehicle v) {
        return true;
    }

    private int findAvailableSpots(Vehicle vehicle) {
        for (ParkingSpot s: spots) {
            if (vehicle.canFit(s)) {
                continue;
            }
        }
        return 0;
    }

    //
    public void spotFreed() {

    }
}
