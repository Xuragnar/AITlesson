package practice;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int n = scanner.nextInt();
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum = sum + 1 / i;
        }
        System.out.println("Summary = " + sum);
    }
}
