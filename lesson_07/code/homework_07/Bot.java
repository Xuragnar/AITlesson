package homework_07;

import java.util.Scanner;

// Написать бот, который задет не менее 3-х вопросов (последовательно),
// принимает ответы от пользователя и реагирует на эти ответы.
// Пример: Как вас зовут? Очень приятно, меня зовут Бот1.
// Какой у вас вес? 106 кг. А какой рост? А какой возраст? ... Варианты ответов...,
// которые отвечает бот.
public class Bot {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Hello! What is your name?");
                String name = scanner.next();

                System.out.println("Nice to meet you, " + name + "! What is your weight?");
                int weight = scanner.nextInt();

                System.out.println("What is your height?");
                int height = scanner.nextInt();

                System.out.println("How old are you?");
                int age = scanner.nextInt();

                System.out.println("Thank you for your answers ");
                System.out.println("Your name: " + name + ".");
                System.out.println("Your weight - " + weight + " kg.");
                System.out.println("Your height - " + height + " cm.");
                System.out.println("Your age - " + age + " years.");


                if (age < 18) {
                    System.out.println("You're still young!");
                } else if (age >= 18 && age < 60) {
                    System.out.println("You're in the prime of your life!");
                } else {
                    System.out.println("You're a mature man!");
                }
            }
        }




