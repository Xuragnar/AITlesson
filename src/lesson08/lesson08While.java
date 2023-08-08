package lesson08;

import java.util.Random;
import java.util.Scanner;

public class lesson08While {
    public static void main(String[] args) {
 /*       int i = 0;
        while (i <= 10) {
            System.out.println("Hello! " + i++);
            //          i = i + 1;
            // тело цикла
        }
        System.out.println("End");
        System.out.println("========");


        i = 100;
        while (i > 90) {
            System.out.println("Hello" + i--);


        }
        System.out.println("End2");

        int y = 0;
        Random random = new Random();
        int randomNumber, count12 = 0, count13 = 0;
        while (y < 1_000_000) {
            randomNumber = random.nextInt(13);
            if (randomNumber == 12) count12++;
            if (randomNumber == 13) count13++;
            y++;
        }
        System.out.println("count12 " + count12 + " count13 " + count13);


        int var1 = 0;
        while (var1 != 0) {
            System.out.println("While: var ne raven 0");
        }
        do {
            System.out.println("Do-while var ne raven 0");
        } while (var1 != 0);


        Scanner scanner = new Scanner(System.in);
        int answerInt;
        do {
            System.out.println("Введите число меньше 10");
            answerInt = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Вы ввели число: " + answerInt);
        }
        while (answerInt > 10);
*/


        int counter = 0;
        while (counter <= 20) {
            if(counter % 2 == 0)
            System.out.println(counter);
            counter ++;
        }
          Random random = new Random();
        System.out.println("Введите число:  ");
        Scanner scanner = new Scanner(System.in);
        int userInt = scanner.nextInt();
        int sum = 0;
        int counter1 = 1;

        while (counter1 <= userInt){
            int randomInt = random.nextInt(100)+ 1;
            System.out.println(randomInt + " ");
            sum = sum + randomInt;
            counter1 ++;
        }

        System.out.println("Sum " + sum);
        System.out.println("End " + (counter1 - 1));
        System.out.println("Middle " + (double)sum / (counter1 -1 ) );


    }
}
