package homrwork_09;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        // В кинотеатре есть разные типы билетов: стандартный, студенческий (-10%) и для пенсионеров(-25%).
        // Каждый тип билета имеет свою стоимость. Клиент может также выбрать место в VIP-зоне, что увеличит стоимость билета на 25%.
        // Создайте метод calculateTicketPrice, который принимает возраст клиента, статус студента и флаг VIP-места.

        double price = calculateTicketPrice(60, true, true);
        System.out.println(price);


    }

    public static double calculateTicketPrice(int age, boolean isStudent, boolean isVIP) {
                double finalPrice = 100;
        if (age > 65) {
            finalPrice = finalPrice - finalPrice * (25.0 / 100.0);
        }
        if (isStudent) {
            finalPrice = finalPrice - finalPrice * (10.0 / 100.0);
        }
        if (isVIP) {
            finalPrice = finalPrice + finalPrice * (25.0 / 100.0);
        }
        return finalPrice;
    }
}
