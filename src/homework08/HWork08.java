package homework08;

import java.util.Random;
import java.util.Arrays;

public class HWork08 {
    public static void main(String[] args) {


        int counter = 0;


        Random random = new Random();
        int[] array = new int[random.nextInt(20) + 1];

        while (counter < array.length) {
            array[counter] = random.nextInt(100);
            counter++;
        }


        System.out.println("Исходный массив: " + Arrays.toString(array));


        int minValue;
        int maxValue;
        int minIndex = 0;
        int maxIndex = 0;
        int i = 0;
        int sum = 0;
        minValue = array[0];
        minValue = 0;
        maxValue = array[0];
        maxValue = 0;
        while (i < array.length) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;

            }
            if (array[i] < minValue) {
                minValue = array[i];
                minIndex = i;
            }
            sum += array[i++];

        }
        System.out.println("Min " + minValue + " index min " + minIndex);
        System.out.println("Max " + maxValue + " index min " + maxIndex);
        System.out.println("%.2f " + (double) sum / array.length);

        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        System.out.println("after swap" + Arrays.toString(array));




    }
}