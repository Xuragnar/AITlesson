package goat;

import goat.model.Goat;

public class GoatAppl {
    public static void main(String[] args) {
        Goat goatling1 = new Goat("Peter");

        for (int i = 0; i < 10; i++) {
            goatling1.increment();
        }
        System.out.println(goatling1);
        Goat goatling2 =new Goat("Vasya");

        for (int i = 0; i < 10; i++) {
            goatling2.increment();
        }
        System.out.println(goatling2);
        System.out.println(goatling1);
        System.out.println(Goat.COUNT_MAX);
        System.out.println(Math.PI);
    }
}
