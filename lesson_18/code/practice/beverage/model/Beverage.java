package practice.beverage.model;

public class Beverage {
    private String title;
    private String packing;
    private int quantity;

    public Beverage(String title, String packing, int quantity) {
        this.title = title;
        this.packing = packing;
        this.quantity = quantity;
    }

    public Beverage() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void toBuy(String title, String packing, int quantity) {
        this.packing = packing;
        this.title = title;
        this.quantity = quantity;
        System.out.println("Go to market and buy : " + title + " " + packing + " " + quantity);
    }

    public void displayStock() {
        System.out.println("We have : " + title + " " + packing + " " + quantity);
    }
}
