package homework10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Собрать в массив данные о дневной температуре в вашем городе да прошедшую неделю.
        //Выведите на печать температуру, которая была во вторник и затем в четверг.
        // Найти среднюю температуру за прошлую неделю.

        Scanner scanner = new Scanner(System.in);

        int daysInWeek = 7;
        double[] temperatures = new double[daysInWeek];

        // Получаем данные о температуре за прошлую неделю
        for (int day = 0; day < daysInWeek; day++) {
            System.out.print("Input temperature of a day " + (day + 1) + ": ");
            temperatures[day] = scanner.nextDouble();
        }

        // Вывод температуры для вторника  и четверга
        System.out.println("Temperature in tuesday (day " + 2 + "): " + temperatures[1] + " degrees Celsius");
        System.out.println("Temperature in thursday (day " + 4 + "): " + temperatures[3] + " degrees Celsius");

        // Расчет средней температуры
        double sum = 0;
        for (int day = 0; day < daysInWeek; day++) {
            sum = sum + temperatures[day];
        }

        double averageTemperature = sum / daysInWeek;
        System.out.printf("Last week's average temperature : " + averageTemperature+ " degrees Celsius");
        System.out.println("\nDone!");
    }
}



