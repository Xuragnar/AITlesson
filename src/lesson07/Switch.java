package lesson07;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int x = 4;

        switch (x){
            case 1: {
                System.out.println("x равен 1");
                break;
            }
            case 2:{

                System.out.println("x равен 2");
                break;
            } case 3:{
                System.out.println("x равен 3");
                break;

                }
            default:{
                System.out.println("Введите другое число");
            }
        }
        System.out.println("У меня есть загадка");
        System.out.println("Что ты такое: желтый ,большой");
        System.out.println("Как думешь?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();

        answer = answer.trim().toLowerCase();
        switch (answer){
            case "троллейбус":{
                System.out.println("Правильно ты наверное нагуглил");
                break;

            } case "сдаюсь":{
                System.out.println("Очень жаль");
                break;

            } default:{
                System.out.println("Попробуй еще");
            }
        }
    }
}
