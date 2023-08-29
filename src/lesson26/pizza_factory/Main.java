package lesson26.pizza_factory;

import java.util.Scanner;

public class Main {
    /*
    проект Pizza Factory
    Нужно создать фабрику по производству пиццы.Фабрика должна уметь готовить такие виды пиццы:
    Гавайи,Салями,Моцарелла.Каждый вид пиццы должен уметь:
    подготавливаться(накладывать ингридиенты)
    печься
    упаковываться

    в каждом случае должно быть понятно о каком виде пиццы идет речь.
    В классе Main не должнен создаваться новый обьект пиццы,а из него должен поступать
    поступать заказ на изготовление нужного вида пиццы в класс PizzaFactory,который должен
    выбрать нужную пиццу для изготовления

    Алгоритм реализации:
    1.Нужно создать родительский абстрактный класс Pizza и три дочерних класса
    2.Возможно не все методы родительского класса должны быть абстрактными, а только те, реализация которых
    в дочерних классах различна
    3.Создать класс PizzaFactory , в котором будет осуществляться создание нового обьекта пицца в
    зависимости от  выбора заказчика(Возможно использовать Switch)


     */
    public static void main(String[] args) {

        PizzaFactory factory = new PizzaFactory();
        Pizza salami = factory.createPizza("1");
        salami.orderPizza();
        System.out.println();
        Pizza mozarella = factory.createPizza("2");
        mozarella.orderPizza();
        System.out.println();
        Pizza hawaii = factory.createPizza("3");
        hawaii.orderPizza();

        System.out.println("------------With Scanner-------------");

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Pizza choice: Enter 1 for Salami, 2 for Mozarella, 3 for Hawaii");
            String pizzaChoice = scanner.nextLine();

            Pizza newPizza=factory.createPizza(pizzaChoice);

            newPizza.orderPizza();

            System.out.println("Do you want to order another pizza? press no/ any other key if yes");
        } while (!scanner.nextLine().equalsIgnoreCase("no"));
        System.out.println("Thank you for your order! We hope to see you again soon");

    }
}


