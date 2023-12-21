package practice.prime_numbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class PrimeNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(
                10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
        ));
        //отобразить только простые числа из списка
        System.out.println("Numbers: ");
        numbers.stream()
                .forEach(n -> System.out.print(n + " "));//терминальная операция
        System.out.println();

        System.out.println("Prime numbers: ");
        numbers.stream()
                .filter(n->isPrime(n)) // фильтр
                .forEach(n-> System.out.print(n+ " "));

        System.out.println();

        //another method

        System.out.println("Prime numbers -2 : ");
        numbers.stream()
                .map(n->isPrime(n))
                .forEach(n-> System.out.println(n + " "));



    }

    public static boolean isPrime(int n ){
        int i = 2;
        while (i<n){
            if(n%i==0){
               return false;
            }
            i++;
        }
        return true;
    }
}
