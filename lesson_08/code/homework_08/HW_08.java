package homework_08;

import java.util.Scanner;

public class HW_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your sentence");
        String sentence = scanner.nextLine();
        System.out.println("How many times do you have to repeat");
        int num = scanner.nextInt();
        int count = 0;
        while (num > count) {
            System.out.println(sentence);
            count++;
        }
        System.out.println("sum of numbers " + count);
    }
}
