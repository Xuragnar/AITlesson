package practice;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        //  Scanner scanner = new Scanner(System.in);
        //  System.out.println("Input number");
        int count = 1;
        //  int number = scanner.nextInt();
        while (count <= 100) {
            if (count % 5 == 0) {
                System.out.print(count + " | ");
            }
            count++;
        }
    }
}
