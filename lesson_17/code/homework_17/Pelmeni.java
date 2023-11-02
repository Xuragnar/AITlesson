package homework_17;

import java.util.Random;

//Задача 2. (повторение и закрепление темы массивы, заполнение массива с помощью датчика случайных чисел) Задача про поиск "счастливого пельменя".
// Часть 1.
// Хозяйка налепила для гостей 30 пельменей, каждый весом от 25 до 35 грамм. Напишите программу, которая занесет в массив данные о весе каждого слепленного пельменя. Часть 2. Хозяйка налепила для гостей 30 пельменей.
// В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм. Напишите программу, которая ищет счастливый пельмень.
public class Pelmeni {
    public static void main(String[] args) {

        int numberOfPelmeni = 30;
        int minWeight = 25;
        int maxWeight = 35;

        int[] pelmeniWeights = new int[numberOfPelmeni];
        Random random = new Random();


        for (int i = 0; i < numberOfPelmeni; i++) {
            pelmeniWeights[i] = random.nextInt(maxWeight - minWeight + 1) + minWeight;
        }

        for (int i = 0; i < numberOfPelmeni; i++) {
            System.out.println("Pelmen" + (i + 1) + " = " + pelmeniWeights[i] + " gram ");
        }

        int[] pelmeniVied = new int[30];

        Random rondom = new Random();
        for (int i = 0; i < pelmeniVied.length; i++) {
            pelmeniVied[i] = rondom.nextInt(35 - 25) + 25;


        }
        int happyIndex = rondom.nextInt(pelmeniVied.length);
        pelmeniVied[happyIndex] += 15;
        System.out.println("Lucky pelmen with number : " + happyIndex);
    }

}
