package homework09;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HWork09 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];//определили массив на 20 элементов

        for (int x = 0; x < array.length; x++) {
            array[x] = random.nextInt(100);
            System.out.println(array[x]);

        }
        // количество четных чисел в массиве
        int count = 0; //cчетчик для четных чисел


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) { // текущий элемент делится на 2 без остатка
                count++; // увеличили стетчик на единицу
            }
        }
        System.out.println(" Количество четных чисел " + count);

        // cумма четных чисел
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) { // текущий элемент делится на 2 без остатка
                sum = sum + array[i]; // накапливаем сумму
            }
        }
        System.out.println(" сумма четных чисел " + sum);

        Scanner scanner = new Scanner(System.in);

        float depositSum;
        int months;
        float stavka = 7f;

        System.out.println("Введите сумму вклада: ");
        depositSum = scanner.nextFloat();

        System.out.println("Введите количество месяцев");
        months = scanner.nextInt();
        if (months >= 1 && depositSum > 0) {
            for (int i = 1; i <= months; i++) {
                float percents = depositSum * stavka / 100;
                depositSum += percents;
            }

        } else {
            System.out.println("Incorrect data");
        }
        System.out.println("После " + months + " Вы получите " + depositSum);

        int[] numbers = new int[50];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(numbers));
        int countSimple = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean isPrime = true;
            for (int j = 2; j < numbers[i]; j++) {
                if (numbers[i] % j == 0) {
                    isPrime = false;
                }
            }
            if (isPrime) {
                System.out.print(numbers[i] + " ");
                countSimple++;

            }
        }
        System.out.println("\nКоличество простых чисел в массиве: " + countSimple);

        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 1; j++) {
                System.out.print(j);
            }
        }
        System.out.println();
    }
}
