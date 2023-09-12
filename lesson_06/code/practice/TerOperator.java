package practice;

import java.util.Scanner;

public class TerOperator {
    public static void main(String[] args) {
        int a = 123;
        int b = -745;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Input second number: ");
        int number2 = scanner.nextInt();

        int isMin = (a < b) ? a : b;

        int isMin2 = (number1 < number2) ? number1 : number2;
        System.out.println("Minimum = " + isMin);
        System.out.println("Minimum = " + isMin2);
    }
}
