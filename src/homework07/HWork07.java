package homework07;

import jdk.internal.org.jline.utils.ShutdownHooks;

import java.util.Scanner;

public class HWork07 {
    public static void main(String[] args) {
        //      System.out.println("Task0");

        //      int Task = 1;

        //    while (Task <= 10) {
        //      System.out.println("Task" + Task++);
        //     }


        //      System.out.println("Task1");
        int var = 1;
        do {
            if (var % 5 == 0) {
                System.out.println("Вывести на экран числа от 1 до 100 которые делятся на 5:" + var);
            }
            var++;


        }
        while (var <= 100);


 //       System.out.println("Task2");
        int var1 = 1;
        int var2 = 1;
        while ( var1 <= 100 & var2 <= 7) {
            if (var1 % 5 == 0 ) {
                System.out.println("Вывести на экран только 7 чисел от 1 до 100 которые делятся на 5:" + var1);
                var2++;
            }
            var1++;




        }
 //       System.out.println("Task3");

        Scanner scanner = new Scanner(System.in);
            String word ;
        do {
            System.out.println("Введите слова hello!");
             word = scanner.nextLine();

        }while (!word.trim().toLowerCase().equals("hello!"));










    }
}

