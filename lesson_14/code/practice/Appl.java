package practice;

public class Appl {
    public static void main(String[] args) {
        int[] array = {-12, 5, 36, 28, -16, 100, 82, 64, 57, 5};

        BubbleSortV2.printArray(array);//print before sorting
        BubbleSortV2.bubbleSort(array);//sorting
        BubbleSortV2.printArray(array);//print after sorting

    }
}
