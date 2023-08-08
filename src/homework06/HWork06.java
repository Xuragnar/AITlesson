package homework06;

import java.util.Random;
import java.util.Scanner;

public class HWork06 {
    public static void main(String[] args) {
 /*       System.out.println("Task0");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 3 ");
        int userInputInt = scanner.nextInt();


        switch (userInputInt) {
            case 1: {
                System.out.println("Вы ввели 1");
                break;
            }
            case 2: {
                System.out.println("Вы ввели 2");
                break;
            }
            case 3: {
                System.out.println("Вы ввели 3");
                break;
            }
            default:
                System.out.println("Неверно введено число");

        }
  */
 /*       System.out.println("Task1");


        System.out.println("Введите число от 1 до 7");
        Scanner scanner = new Scanner(System.in);
        int userInputInt1 = scanner.nextInt();

        switch (userInputInt1) {
            case 1: {
                System.out.println("Понедельник");
                break;
            }
            case 2: {
                System.out.println("Вторник");
                break;

            }
            case 3: {
                System.out.println("Среда");
                break;
            }
            case 4: {
                System.out.println("Четверг");
                break;
            }
            case 5: {
                System.out.println("Пятница");
                break;
            }
            case 6:
            case 7:
            {
                System.out.println("Выходной");
                break;

            } default:
                System.out.println("Введено некорректное число");

        }
  */
        System.out.println("Task2");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int evaluation = random.nextInt(12);
        int time = 45;
        switch (evaluation) {
            case 10:
            case 11:
            case 12:
                time += 60;
                System.out.println("Красаучик " + time + " минут");
                break;
            case 7:
            case 8:
            case 9:
                time += 45;
                System.out.println("Молодец " + time + " минут");
                break;
            case 4:
            case 5:
            case 6:
                time += 15;
                System.out.println("Ну такое ... " + time + " минут");
                break;
            case 1:
            case 2:
            case 3:
                time -= 30;
                System.out.println("Очень жаль ... " + time + " минут");
                break;
            default:
                time = 0;
                System.out.println("Ужас епт " + time +  " минут" );
        }
    }

}

