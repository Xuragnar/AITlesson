package homework_12;


public class Array1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int a = -10;
        int b = 10;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * (b - a + 1) + a);
        }

        int oddSum = sumOfOddNumbers(numbers);
        System.out.println("Sum of odd elements of the array: " + oddSum);
        System.out.println("Sum of odd elements of the array even-numbered: " + sumOfOddNumbersEven(numbers));
    }

    public static int sumOfOddNumbers(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    public static int sumOfOddNumbersEven(int[] arr) {
        int sum1 = 1;

        for (int i = 0; i < arr.length; i = i + 2) {
            sum1 = sum1 * arr[i];
        }
        return sum1;

    }
}
