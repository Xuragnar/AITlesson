package practice.fibonacci;

public class FibonacciAppl {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(8);
        // TODO - распечатать первые 8 чисел из ряда Фибоначчи
        // 1, 1, 2, 3, 5, 8, 13, 21 - это должно получиться

        int sum = 0;
        for (Integer num : fibonacci) {
            sum += num;
            System.out.println(num);
        }
        System.out.println("Sum = " + sum);
    }
    // TODO - сложить все эти числа
    // sum = 54


}


