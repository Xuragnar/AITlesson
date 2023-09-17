package practice;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        //   Scanner scanner=new Scanner(System.in);
        //   System.out.println("Input number");
        int n = 1;
        int m = 1;

        while (n < 10) {
            while (m <= 10) {
                System.out.print(n + " * " + m + " = " + n * m + "|");
                m++;
            }
            System.out.println();// переход на след строку
            m = 1;// сброс на начальное значение
            n++;
        }
    }
}
