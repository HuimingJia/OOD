package PersonalBudget;

public class Transaction {
    String Location;
    String Merchant;
    int Date;
    int price;
    String Node;

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getMerchant() {
        return Merchant;
    }

    public void setMerchant(String merchant) {
        Merchant = merchant;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int date) {
        Date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getNode() {
        return Node;
    }

    public void setNode(String node) {
        Node = node;
    }
}
