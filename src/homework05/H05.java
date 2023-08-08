package homework05;

import java.util.Scanner;

public class H05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод четырехзначного числа в виде строки
        System.out.print("Введите четырехзначное число: ");
        String input = scanner.nextLine();

        // Проверяем, является ли введенная строка четырехзначным числом
        if (input.length() != 4) {
            System.out.println("Ошибка: Введено не четырехзначное число!");
        } else {
            // Получаем цифры из строки и вычисляем суммы первых двух и последних двух цифр
            int digit1 = Character.getNumericValue(input.charAt(0));
            int digit2 = Character.getNumericValue(input.charAt(1));
            int digit3 = Character.getNumericValue(input.charAt(2));
            int digit4 = Character.getNumericValue(input.charAt(3));

            int sumFirstTwoDigits = digit1 + digit2;
            int sumLastTwoDigits = digit3 + digit4;

            // Проверяем, является ли число "счастливым билетом" и выводим результат
            if (sumFirstTwoDigits == sumLastTwoDigits) {
                System.out.println("Число является счастливым билетом!");
            } else {
                System.out.println("Число НЕ является счастливым билетом.");
            }
        }
    }
}
