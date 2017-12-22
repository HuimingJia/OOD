package FlightTicketSystem;

public class Flight {
    private int id;
    private String company;
    private Airport source;
    private Airport destination;
    private int departTime;
    private int arrivalTime;
    private int advancedSeat;
    private int seat;

    public boolean aBoolean;

    public boolean bookSeat() {
        if (seat <= 0) {
            return false;
        }
        seat--;
        return true;
    }

    public boolean bookAdvancedSeat() {
        if (advancedSeat <= 0) {
            return false;
        }
        advancedSeat--;
        return true;

    }

    public void cancelTicket() {
        seat++;
    }

    public void cancelAdvancedTicket() {
        advancedSeat++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Airport getSource() {
        return source;
    }

    public void setSource(Airport source) {
        this.source = source;
    }

    public Airport getDestination() {
        return destination;
    }

    public void setDestination(Airport destination) {
        this.destination = destination;
    }

    public int getDepartTime() {
        return departTime;
    }

    public void setDepartTime(int departTime) {
        this.departTime = departTime;
    }

    public int getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public int getAdvancedSeat() {
        return advancedSeat;
    }

    public void setAdvancedSeat(int advancedSeat) {
        this.advancedSeat = advancedSeat;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
}
