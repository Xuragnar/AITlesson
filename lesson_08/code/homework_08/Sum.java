package homework_08;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        if (number < 0) {
            System.out.println("Enter a positive number");
            return;
        }
        int sum = 0;
        while (number > 0) {
            sum = sum + number % 10;
            number = number / 10;
        }
        System.out.println("Сумма цифр числа равна " + sum);
    }
}
