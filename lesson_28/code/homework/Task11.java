package homework;

public class Task11 {


    public int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // поиск элемента в массиве
    public int findToElement(int[]arr,int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i; // возвращаем индекс найденного элемента
            }
        }

        return -1; // возвращаем -1, если элемент не найден в массиве
    }

}
