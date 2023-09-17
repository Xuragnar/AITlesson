package homework_08;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many km did you run today");
        double s = scanner.nextInt();
        System.out.println("How many km do you want to run");
        int target = scanner.nextInt();
        int day = 0;
        while (s < target) {
            s = s + s * 0.1;
            System.out.printf("Distance: %.2f ",s );
            System.out.println();
            day++;
        }
        System.out.println("After " + day + " days you will reach the target " + target + " km.");
    }
}
