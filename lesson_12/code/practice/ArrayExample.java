package practice;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array = {75, 34, -15, -123, 57, -145, 86, 77, 48, -59};
        int[] arry1 = {0, -5, 16, 89, -99};
        minElOfArray(array);
        minElOfArray(arry1);
        System.out.println("Min element of array is: " + minElOfArray(array));
        int i = minElOfArrayIndex(array);
        System.out.println("Index of Min element of array is " + i);

    }

    public static int minElOfArrayIndex(int[] array) {
        int min = array[0];
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){

                min = array[i];
            indexMin = i;
            }
        }
        return indexMin;
    }

    public static int minElOfArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
