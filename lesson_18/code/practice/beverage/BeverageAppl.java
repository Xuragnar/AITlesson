package practice.beverage;

import practice.beverage.model.Bear;
import practice.beverage.model.Beverage;

public class BeverageAppl {
    public static void main(String[] args) {
        Beverage b1 = new Beverage("Milk", "box", 10);
        b1.toBuy("Milk", "box", 20);
        b1.displayStock();

        System.out.println("=========================================");

        Bear b2 = new Bear("Augistiner", "pack", 10, "elle");
        b2.toBuy("Augistiner", "pack", 10, "elle");
        b2.displayStock();

        Beverage beverage = new Beverage();
        beverage.displayStock();

        Bear beer=new Bear();
        beer.displayStock();

    }
}
