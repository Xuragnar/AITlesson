package homework10;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        //Создайте массив из 20 целых чисел в интервале от 10 до 30.
        // Выведите массив на печать. Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.

        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 10 + i;
        }
        System.out.println("Original array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
        // Меняем местами первый и последний элементы массива
        if (numbers.length > 1) {
            int temp = numbers[0];
            numbers[0] = numbers[numbers.length - 1];
            numbers[numbers.length - 1] = temp;
        }
        // Выводим массив после обмена на печать
        System.out.println("Array after exchanging the first and last elements:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

