package homework13;

import java.util.Arrays;

public class HWork13 {
    public static void main(String[] args) {

        int[] ints = {0, 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(ints));

        swap(ints, 1, 4);

        System.out.println(Arrays.toString(ints));


    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index2];
        array[index2] = array[index1];
        array[index1] = temp;
    }
}
