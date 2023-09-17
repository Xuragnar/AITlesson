package practice;

import java.util.Scanner;

public class Ampel {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is the color (Red, Yellow, Green):");
        String color = scanner.next();
        switch (color) {
            case "Red" -> System.out.println("Stop, waiting!");
            case "Yellow" -> System.out.println("Be ready, to go.");
            case "Green" -> System.out.println("Go go go");
            default -> System.out.println("Wrong input");
        }
    }
}
