package PizzaDelivery;

import java.util.ArrayList;

public class Customer {
    String contact;
    String name;
    String address;
    ArrayList<Order> orders;

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Order> getOders() {
        return new ArrayList<>();
    }

    public void setOders(ArrayList<Order> oders) {
        this.orders = oders;
    }

    public ArrayList<Restaurant> searchRestaurantByName(String name) {
        return new ArrayList<>();
    }


    public ArrayList<Restaurant> searchRestaurantByLocation(String location) {
        return new ArrayList<>();
    }

    public ArrayList<Restaurant> searchOpenResturant() {
        return new ArrayList<>();
    }

    public Order trackOrder() {
        if (orders.size() == 0) return null;
        return orders.get(orders.size() - 1);
    }


    public boolean cancelOrder(Order o) {
        return true;
    }

    public boolean confirmOrder(Order o) {
        return true;
    }
}
