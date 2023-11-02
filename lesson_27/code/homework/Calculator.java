package homework;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
    }


    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int subtraction(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("You can't divide by zero");
        }
        return num1 / num2;
    }

    public int modulo(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("You can't modulo by zero");
        }
        return num1 % num2;
    }

}
