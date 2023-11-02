package practice.time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class TimeAppl {
    public static void main(String[] args) {
        //        **Работа с датами:**
//        - узнать текущую дату и время
//        - есть дата, какой это был день недели? день месяца? день года?
//        - есть дата, как узнать, это было раньше? или позже?
//          **Путешествие во времени**
//        - в будущее currentDay.plus
//        - в прошлое currentDay.minus
//        - использование ChronoUnit
//          **Получение интервала времени**
//          **Сортировка массива по времени**
//         **Date Formatter**
//          **Парсинг даты из строки**

        LocalDate currentDay = LocalDate.now();
        System.out.println(currentDay);// международный формат даты
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate gagarin = LocalDate.of(1961, 4, 12);
        System.out.println(gagarin.getYear());
        System.out.println(gagarin.getDayOfYear());
        System.out.println(gagarin.getDayOfWeek());
        System.out.println("Start Gagarin date of week " + gagarin.getDayOfWeek());

        System.out.println(gagarin.isBefore(currentDay));// ожидаем true
        System.out.println(gagarin.isAfter(currentDay));// ожидаем false

        System.out.println("======Traveling in time======");
        LocalDate newDate = currentDay.plusDays(50);
        System.out.println(newDate);

        newDate = currentDay.plusWeeks(12);
        System.out.println(newDate);

        // 2 months ago

        newDate = currentDay.minusMonths(2);
        System.out.println("Two months ago " + newDate);

        //operations with chronounits
        System.out.println(localDateTime.plus(9, ChronoUnit.HALF_DAYS));// сколько половинок дней прошло
        //CENTURE - 100 years
        newDate = currentDay.plus(2, ChronoUnit.CENTURIES);
        System.out.println("In 2 centuries: " + newDate);
        System.out.println("It will be day of week " + newDate.getDayOfWeek());
        //получение интервала времени(сколько лет прошло ?сколько лет персоне?)
        LocalDate einstein = LocalDate.of(1879, 3, 14);
        long res = ChronoUnit.YEARS.between(einstein, gagarin);
        System.out.println(res);

        System.out.println("Compare dates");
        System.out.println(einstein.compareTo(gagarin));//сравнение дат
        LocalDate yesterday = LocalDate.of(2023, 10, 30);
        System.out.println(currentDay.compareTo(yesterday));


        //sorting time

        LocalDate[] dates = {yesterday, einstein, gagarin, currentDay};
        System.out.println(Arrays.toString(dates));// не отсортирован
        Arrays.sort(dates);                        // sorting
        System.out.println(Arrays.toString(dates));//  отсортирован
    }
}
