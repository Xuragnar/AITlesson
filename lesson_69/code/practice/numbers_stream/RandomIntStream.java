package practice.numbers_stream;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

public class RandomIntStream {
    private static final int N_NUMBER = 6;
    private static final int MIN = -10;
    private static final int MAX = 10;

    public static void main(String[] args) {
        Stream<Integer> numbers = getRandomNumbers(N_NUMBER, MIN, MAX);
        numbers.forEach(System.out::print);
        System.out.println();
        Stream<Integer> numbers1 = getRandomNumbers(N_NUMBER, MIN, MAX);
        numbers1.forEach(s -> System.out.print(s + " | "));

        long positiveCount = getRandomNumbers(N_NUMBER, MIN, MAX)
                .peek(n -> System.out.print(n + " | "))
                .filter(n -> n > 0)
                .count();
        System.out.println("\nPositive numbers: " + positiveCount);
        long negativeCount = getRandomNumbers(N_NUMBER, MIN, MAX)
                .peek(n -> System.out.print(n + " | "))
                .filter(n -> n < 0)
                .count();
        System.out.println("\nNegative numbers: " + negativeCount);

        int sumOddNumbers = getRandomNumbers(N_NUMBER, MIN, MAX)
                .peek(n -> System.out.print(n + " | "))
                .filter(n -> n % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("\nSum of odd numbers from stream: " + sumOddNumbers);
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        int max = getRandomNumbers(N_NUMBER, MIN, MAX)
                .peek(n -> System.out.print(n + " | "))
                .max(Comparator.naturalOrder())
                .orElseThrow();
        System.out.println("\nMax value = " + max);

        IntSummaryStatistics intStat = getRandomNumbers(N_NUMBER, MIN, MAX)
                .mapToInt(Integer::intValue)
                .peek(n -> System.out.print(n + " | "))
                .summaryStatistics();
        System.out.println("\nmin = " +intStat.getMin());
        System.out.println("\nmax = " +intStat.getMax());
        System.out.println("\nmin = " +intStat.getMin());

    }

    private static Stream<Integer> getRandomNumbers(int nNumber, int min, int max) {
        return new Random()
                .ints(min, max)
                .limit(nNumber)
                .boxed();
    }
}
