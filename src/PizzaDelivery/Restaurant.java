package PizzaDelivery;

public class Restaurant {
    private String name;
    private String location;
    private String contact;
    private int opentime;
    private int closetime;
    private Menu menu;

    public boolean isOpen() {
        return true;
    }


    public Menu displayMenu() {
        return menu;
    }

    public void updateMenu() {

    }

    public boolean addNewPizza(Pizza p) {
        boolean res = menu.addItem(p);
        if (res) displayMenu();
        return res;
    }

    public boolean deletePizza(Pizza p) {
        boolean res = menu.deleteitem(p);
        if (res) displayMenu();
        return res;
    }

    public boolean generateOrder(Order o) {
        return true;
    }

    public boolean cancelOrder(Order o) {
        return true;
    }

}
