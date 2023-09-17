package homrwork_09;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        //Определение времени суток. Напишите программу, которая принимает текущий час (от 0 до 23) и
        // выводит приветствие в зависимости от времени суток (утро, день, вечер, ночь).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input time");
        int time = scanner.nextInt();
        switch (time) {
            case 0, 1, 2, 3, 4 -> System.out.println("Night");
            case 5, 6, 7, 8 -> System.out.println("Morning");
            case 9, 10, 11, 12, 13, 14, 15, 16, 17, 18 -> System.out.println("Day");
            case 19, 20, 21, 22, 23 -> System.out.println("Evening");
        }
    }
}
