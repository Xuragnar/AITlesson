package practice.coffee;

import java.util.Scanner;

public class CoffeAppl {
    public static void main(String[] args) {
        System.out.println("Welcome to CoffeeShop!");
        Coffee[] menu = Coffee.values();
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + " - " + menu[i].getType());
        }

        while (true) {
            System.out.println("Input your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1,2,3,4 -> {
                    System.out.println("Your choice is: " + menu[choice - 1].getType());
                    System.out.println("The price is: " + menu[choice - 1].getPrice());
                    break;
                }
                default -> System.out.println("Wrong choice");
            }
        }

    }
}
