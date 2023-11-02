package practice;

public class ArrayApplication {
    public static void main(String[] args) {

        int[] number = {8, 9, 12, 65, 98, 3, 57, 4, 1, 22};
        ArraysMethods.printArray(number);
        int max = ArraysMethods.maxArray(number);
        System.out.println("Maximum = " + max);
        int maxIndex = ArraysMethods.maxArrayIndex(number);
        System.out.println("Index of max element = " + maxIndex);
        ArraysMethods.sortArray(number);// sorting
        ArraysMethods.printArray(number);//printing
        ArraysMethods.split();

        int[] number2 = {-5, 56, -100, 0, 15, 52, 67, 8, 1};
        ArraysMethods.printArray(number2);
        int max2 = ArraysMethods.maxArray(number2);
        System.out.println("Maximum of second array = " + max2);
        int maxIndex2 = ArraysMethods.maxArrayIndex(number2);
        System.out.println("Index of max element = " + maxIndex2);
        ArraysMethods.sortArray(number2);
        ArraysMethods.printArray(number2);
        ArraysMethods.split();


        String[] digits = {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"};
        ArraysMethods.printArray(digits);


    }
}
