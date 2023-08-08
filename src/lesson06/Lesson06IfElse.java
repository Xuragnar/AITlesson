package lesson06;

import java.util.Random;
import java.util.Scanner;

public class Lesson06IfElse {
    public static void main(String[] args) {
        int x = 8;

//        if(x <= 10) System.out.println("Привет всем ");

        System.out.println("x before if:" + x);

        if (x == 10) {
            x = x - 1;
            System.out.println("x: " + x);
        }
        System.out.println("x after if:" + x);


        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите число 1: ");

        int userInputInt = scanner.nextInt();
        if (userInputInt == 1) {
            System.out.println("Вы ввели число 1 ");

        } else if (userInputInt == 3) {
            System.out.println("Вы же ввели 3, а не 1:");
        } else if (userInputInt == 5)
        {
            System.out.println("Вы ввели число 5 ");
        }
        else {
            System.out.println("Вы ввели что то непонятное");
        }



        System.out.println("Вышли из оператора if");


    Random random = new Random();
    int money = 100;
    int note = random.nextInt(5);
    if (note == 5){
        money += 10 ;

    }else if (note == 4 ){
        money += 10;

    }else if (note == 3){

    }else if (note == 2)

    {
        money -= 20;
    }
        else if (note == 1){
            money = 0;
        }
        int var1 = 10;
        int var2 = var1 == 10 ? 20 : var1 - 0;
        System.out.println(var2);
    }
}

