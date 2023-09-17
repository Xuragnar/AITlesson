package practice;

import java.util.Locale;
import java.util.Scanner;

public class WeekDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input day of week:(two first letter of day) ");
        String dayOfWeek = scanner.next();
 //       dayOfWeek=dayOfWeek.toLowerCase();

        switch (dayOfWeek) {
            case "Mo" -> System.out.println("Monday");
            case "Tu" -> System.out.println("Tuesday");
            case "We" -> System.out.println("Wednesday");
            case "Th" -> System.out.println("Thursday");
            case "Fr" -> System.out.println("Friday");
            case "Sa" -> System.out.println("Saturday");
            case "Su" -> System.out.println("Sunday");
            default -> System.out.println("Wrong input");
        }
    }
}
