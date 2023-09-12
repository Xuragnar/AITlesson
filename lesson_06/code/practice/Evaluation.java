package practice;

import java.util.Scanner;

public class Evaluation {
    public static void main(String[] args) {
        int timeForGame = 60;// сколько разрешено играть на компьютере

        Scanner scanner = new Scanner(System.in);//включили ввод данных с клавиатуры
        System.out.println("Input today's mark:");// приглашение ко вводу
        int mark = scanner.nextInt();// получение оценки с клавиатуры

        switch (mark) {
            case 1: {
                System.out.println("Good child!");//похвалили
                timeForGame = timeForGame + 30;//увеличили время
                break;
            }
            case 2: {
                System.out.println("Sehr gut!");
                break;
            }
            case 3: {
                System.out.println("Not so good!");
                timeForGame = timeForGame - 30;//уменьшаем время
                break;
            }
            case 4: {
                System.out.println("Very bad");
                timeForGame = 0;
                break;
            }
            case 5:{
                System.out.println("Shame you!");
                System.out.println("No games for 2 days!");
                break;
            }
            default:{
                System.out.println("Wrong input");
            }
        }
    }
}
