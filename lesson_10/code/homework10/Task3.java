package homework10;

public class Task3 {
    public static void main(String[] args) {
//Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38. Найдите максимальный элемент массива и его индекс.

        int[] numbers = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
        int maxElement = numbers[0];
        int maxElementIndex = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxElement) {
                maxElement = numbers[i];
                maxElementIndex = i;
            }
        }
        System.out.println("Maximum element : " + maxElement);
        System.out.println("Index of the maximum element : " + maxElementIndex);
    }
}

