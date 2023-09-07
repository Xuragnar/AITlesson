package practice;

public class Circus {
    public static void main(String[] args) {
        lightOn();
        entertainer();
        lightOff();

    }

    public static void lightOn() {
        System.out.println("Lights on!");
    }

    public static void entertainer() {
        jogger();
        singer();
        clown();
    }

    public static void lightOff() {
        System.out.println("Lights off!");
    }

    public static void jogger() {
        System.out.println("My name is John.");
        System.out.println("I am jogging!");
    }

    public static void singer() {
        System.out.println("My name is Phillip");
        System.out.println("I am singing!");
    }

    public static void clown() {
        System.out.println("My name is Oleg");
        System.out.println("I am joking");
    }
}
