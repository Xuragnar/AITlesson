package homework_05;

public class Triangle {
    public static void main(String[] args) {
        //Задать в программе три стороны треугольника.
        // проверить выполнимость неравенства треугольника - любая из сторон должна
        // быть меньше суммы двух других.
        // Сообщить результат - существует или нет треугольник с заданными сторонами.

        double a = 8, b = 4, c = 5;

        if (a + b > c & a + c > b & b + c > a) {
            System.out.println("Good triangle");
        } else {
            System.out.println("Its not a triangle");
        }

    }
}
