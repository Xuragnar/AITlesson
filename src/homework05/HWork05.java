package homework05;

import java.util.Random;
import java.util.Scanner;

public class HWork05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число от 1 до 3 :");
        int userInputInt = scanner.nextInt();
        if (userInputInt == 1) {
            System.out.println("Вы ввели 1 ");
        } else if (userInputInt == 2) {
            System.out.println("Вы ввели 2 ");
        }  else if (userInputInt == 3){
            System.out.println("Вы ввели 3 ");
        }



        System.out.println("Task01");

        Random random = new Random();
        int randomInt = random.nextInt(100);
        int randomInt1 = random.nextInt(100);
        int randomInt2 = random.nextInt(100);
        int randomInt3 = random.nextInt(100);

        System.out.println(randomInt);
        System.out.println(randomInt1);
        System.out.println(randomInt2);
        System.out.println(randomInt3);

        int maxNum = randomInt;
        if (randomInt1 > maxNum) {
            maxNum = randomInt1;

        }  if (randomInt2 > maxNum) {
            maxNum = randomInt2;

        }  if (randomInt3 > maxNum) {
            maxNum = randomInt3;

        }
        System.out.println("Максимальное число из 4х :" + maxNum);


    }
}
