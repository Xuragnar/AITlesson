package homework_07;

import javax.sound.midi.Soundbank;
import java.util.Locale;
import java.util.Scanner;

public class Caffe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your drink");
        String caffe = scanner.next().toLowerCase(Locale.ROOT);
        switch (caffe) {
            case "espresso" -> System.out.println("Price 1.0 €");
            case "americano" -> System.out.println("Price 1.50 €");
            case "latte" -> System.out.println("Price 2.0 €");
            case "cappuccino" -> System.out.println("Price 3.75 €");
            default -> System.out.println("It's out of stock!");
        }
    }
}
