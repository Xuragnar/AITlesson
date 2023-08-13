package lesson18;

import java.util.Arrays;

public class Lesson18 {
    public static void main(String[] args) {


//        int[] array = new int[2];
//        int var = 10;
//        array[0] = var;
//
//        System.out.println(Arrays.toString(array));
//
//        int var2 = 25;
//        array[1] = var2;
//        System.out.println(Arrays.toString(array));

        RubberArray ra = new RubberArray();


        ra.printArray();
        ra.min();
        ra.add(10);
        ra.add(25);
        ra.add(-20);
        ra.printArray();

        int raSize = ra.size();
        System.out.println("Now in massiv " + raSize + " elements");

        System.out.println("Sum elementov v massive " + ra.sumOfValues());

        ra.add(7, 14, -21);

        ra.printArray();
        System.out.println("Min v massive " + ra.min());
        System.out.println("Max v massive " + ra.max());
        int[] newArray = ra.toArray();
        newArray[0]=10_000;
        System.out.println(Arrays.toString(newArray));
        ra.printArray();

        ra.deleteByIndex(5);
        ra.printArray();
    }
}
