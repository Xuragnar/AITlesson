package homework11;

public class HWork11 {
    public static void main(String[] args) {
// Написать метод принимающий целое число и проверяющий является ли число простым.
// Если является, метод должен вернуть true, не является - false
// простое число это число которое делится на 1 ,само на себя и больше ни на что не делится
// 12 не является простым числом т к делится на 2
// 13 простое число
        // надо в цикле начиная с 2 перебрать все числа до n и проверить если остаток от деления хоть
        // 1 раз будет равен 0 то число будет не простым
        //      primeInMethod(17);
        System.out.println(primeInMethod(1));

    }

    public static boolean primeInMethod(int x) {
        boolean res = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                res = false;//значит число не простое,простое true!!!
            }
        }
        if (x <= 1) {
            return false;
        }

        return res;
    }
}
