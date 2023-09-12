package homework_06;

import javax.swing.*;
import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select the number of the month ");
        int months = scanner.nextInt();

        switch (months) {
            case 12, 1, 2: {
                System.out.println("Winter");
                break;
            }
            case 3, 4, 5: {
                System.out.println("Spring");
                break;
            }
            case 6, 7, 8: {
                System.out.println("Summer");
                break;
            }
            case 9, 10, 11: {
                System.out.println("Autumn");
                break;
            }
            default:{
                System.out.println("Wrong input,select another number");
            }
        }
    }
}
