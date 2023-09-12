package homework_06;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number1 :");
        int num1 = scanner.nextInt();
        System.out.println("Input number2 :");
        int num2 = scanner.nextInt();
        System.out.println("Choose operation :");
        int oper = scanner.nextInt();
        int result = 0;

        switch (oper) {
            case 1: {
                result = num1 + num2;
                System.out.println("Result " + result);
                break;
            }
            case 2: {
                result = num1 - num2;
                System.out.println("Result " + result);
                break;
            }
            case 3: {
                result = num1 * num2;
                System.out.println("Resul " + result);
                break;
            }
            case 4: {
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result " + result);
                } else {
                    System.out.println("You can't divide by zero");
                }
                break;
            }
            case 5:{
                if(num2!=0){
                    result=num1%num2;
                    System.out.println("Result "+ result);
                }else{
                    System.out.println("You can't divide by zero");
                }
                break;
            }
            default: {
                System.out.println("Wrong input");
            }
        }
    }
}
