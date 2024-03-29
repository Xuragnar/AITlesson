package homework_15;

public class Methods {
    public static void split(){
        System.out.println("===============");
    }
    public static int[] sortedSort(int[] arr) {
        int min = arr[0];
        int indexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            indexMin = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    indexMin = j;
                }
            }
            // переставляем минимальный элемент в начало
            int tmp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = tmp;
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static int binarySearch(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (num < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left ;
    }
    public static int[] getPositiveNumbers(int[] arr) {
        int count = 0;

        // Считаем количество положительных чисел в массиве
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                count++;
            }
        }

        // Создаем массив с положительными числами
        int[] positiveNumbers = new int[count];
        int index = 0;

        // Заполняем массив положительными числами
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveNumbers[index] = arr[i];
                index++;
            }
        }

        return positiveNumbers;
    }
}
