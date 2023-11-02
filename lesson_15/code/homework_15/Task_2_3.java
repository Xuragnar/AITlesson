package homework_15;

public class Task_2_3 {
    public static void main(String[] args) {
        int[] numbers = new int[20];
        int a = -100;
        int b = 100;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        Methods.printArray(numbers);
        Methods.sortedSort(numbers);
        Methods.split();
        int index = Methods.binarySearch(numbers, 0);
        System.out.println("Index of number = " + index);
        Methods.printArray(numbers);
        Methods.split();
        Methods.sortedSort(numbers);
        int[] index1 = Methods.getPositiveNumbers(numbers);
        Methods.printArray(index1);



    }
}
