package lesson28;

public class Main {
    // Введение в Анализ сложности алгоритмов

    /*
    Алгоритм это последовательность щагов которая из себя исключительно вычесление и не учитывает
    особенности реализации "компьютерного железа" на котром она запущена.
    Анализ сложности дает возможность узнать как быстро будет работать программа когда она
    совершает вычисления на разных обьемах входных данных
     */

    public int findMax(int[] ints, int n) {
        int max = ints[0];

        for (int i = 0; i < n; i++) {
            if (ints[i] > max) {

                max = ints[i];
            }
        }
        return max;
    }
}
