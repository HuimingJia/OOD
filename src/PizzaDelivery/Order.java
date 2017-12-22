package PizzaDelivery;

import java.util.ArrayList;
import java.util.HashMap;

public class Order {
    HashMap<Pizza, Integer> food;
    int price;
    String Note;
    int status; //finished, canceled, preparing, delivering
    Restaurant restaurant;
    Customer customer;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public boolean confirmOrder() {
        return true;
    }

    public boolean cancel() {
        return true;
    }
}
