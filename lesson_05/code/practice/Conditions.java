package practice;

public class Conditions {
    public static void main(String[] args) {

        int x = 0;

        if (x > 0) {
            System.out.println("x - positive");
        } else if (x == 0) {
            System.out.println("x = 0");
        } else {
            System.out.println("x - negative");
        }
        int y = 16;
        if (y % 2 == 0) {
            System.out.println("Число: " + y + " - четное");
        } else {
            System.out.println("Число: " + y + " - НЕ четное");
        }
        int age = 15;
        if (age > 18) {
            System.out.println("Congratulation");
        } else {
            System.out.println("Oops");
        }

    }

}
