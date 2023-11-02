package practice;

public class ArraysMethods {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //looking for max element of array
    public static int maxArray(int[] arr) {
        int max = arr[0];//первое приближение для max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    //looking index of maximum element
    public static int maxArrayIndex(int[] arr) {
        int max = arr[0];//первое приближение для max
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    //bubble sort at min to max
    public static int[] sortArray(int[] arr) {
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
         //переставляем минимальный элемент в начало
            int temp =arr[i];
            arr[i]=arr[indexMin];
            arr[indexMin]=temp;

        }
        return arr;
    }//method printing
    public static void split(){
        System.out.println("--------------------");
    }

}
