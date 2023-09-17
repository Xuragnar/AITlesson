package practice;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;
        int div = 2;
        while (div < number) {
            if (number % div == 0) {
                isPrime = false;
            }
            div++;
        }
            System.out.println(number + " is prime " +isPrime);
    }
}
