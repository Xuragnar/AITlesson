package practice.beverage.model;

public class Bear extends Beverage {
    private String type;

    public Bear(String title, String packing, int quantity, String type) {
        super(title, packing, quantity);
        this.type = type;
    }

    public void toBuy(String title, String packing, int quantity, String type) {
        super.toBuy(title, packing, quantity);
        this.type = type;
    }

    public void displayStock() {
        super.displayStock();
        System.out.println("This is " + type + " of beer ");

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Bear() {
    }
}
