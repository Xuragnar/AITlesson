package homework_05;

public class Sales {
    public static void main(String[] args) {
        //Сделайте расчет покупки товаров со скидками.
        // Товар А стоит X евро и на него скидка D%, а товар B стоит Y евро и на него скидка С%.
        // Клиент взял N товаров A и M товаров B. Если сумма покупки превысила 100 евро,
        // то полагается дополнительная скидка 5%. Вычислите итоговую стоимость покупки
        // и величину полученной скидки.

        // Цена товара и скидка на товар
        double priceA = 40;
        double discountA = 10;
        double priceB = 20;
        double discountB = 10;
        // Количество товаров A и B
        int quantityA = 3;
        int quantityB = 2;
        // Скидка
        double costA = priceA * quantityA * (1 - discountA / 100);
        double costB = priceB * quantityB * (1 - discountB / 100);
        //Общая стоимость товаров
        double sumCost = costA + costB;
        //Если сумма покупки больше 100 евро
        if (sumCost > 100) {
            sumCost = sumCost * 0.95;
        }
        //Величина полученной скидки
        double totalDiscount = (priceA * quantityA - costA) + (priceB * quantityB - costB);
        //Вывод
        System.out.println("Total: " + sumCost + " euro");
        System.out.println("Total sales:" + totalDiscount + " euro");
    }
}
