package homework_06;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        //Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж,
        // если базовая зарплата 500$. За 3 года работы надбавка 10%, за 5 лет работы
        // надбавка 50%, за 10 лет работы надбавка 100%, за 15 лет работы надбавка 150%.
        // Сколько лет проработал работник вводится с клавиатуры.
        int baseSalary = 500;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input how many years you working:");
        int years = scanner.nextInt();

        switch (years) {
            case 3: {
                baseSalary = baseSalary + (baseSalary * 10 / 100);
                System.out.println("If you have been working for 3 years " + baseSalary);
                break;
            }
            case 5: {
                baseSalary = baseSalary + (baseSalary * 50 / 100);
                System.out.println("If you have been working for 5 years " + baseSalary);
                break;
            }
            case 10: {
                baseSalary = baseSalary + baseSalary;
                System.out.println("If you have been working for 10 years " + baseSalary);
                break;
            }
            case 15: {
                baseSalary = baseSalary + (baseSalary * 150 / 100);
                System.out.println("If you have been working for 15 years " + baseSalary);
                break;
            }
            default: {
                System.out.println("Wrong input");
            }
        }
    }
}


