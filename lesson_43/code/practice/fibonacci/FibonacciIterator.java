package practice.fibonacci;

import java.util.Iterator;

public class FibonacciIterator implements Iterator<Integer> {
    private int quantity;
    private int prev;
    private int prevPrev;
    private int counter;

    public FibonacciIterator(int quantity) {
        this.quantity = quantity;
        prev = 1;
        prevPrev = 1;
        counter = 1;
    }

    @Override
    public boolean hasNext() {
        return counter <= quantity; // TODO - проверка на кол-во чисел в ряду
    }

    @Override
    public Integer next() {

            if (counter++ <= 2) {
                return 1;
            }

            int curr = prev;
            prev = prev + prevPrev;
            prevPrev = curr;
            return prev;
         // TODO - как получить сл. число Фибоначчи в ряду = предыдущее + текущее

    }
}
