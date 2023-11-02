package practice;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Locale;

public class TimeAppl1 {
    public static void main(String[] args) {
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

        System.out.println("==============DateTime Formatter===========");

        DateTimeFormatter df = DateTimeFormatter.ISO_DATE;//определили формат даты по константе
        System.out.println(gagarin.format(df));
        df = DateTimeFormatter.ofPattern("dd MMMM yy", Locale.ENGLISH);// задали другой формат отображения даты
        System.out.println(gagarin.format(df));

        System.out.println("=================parcing date from string=============");
        String str = "01/11/2023";
        System.out.println(str);

        LocalDate date1 = dateParse(str);//делаем метод для конвертации строки
        System.out.println(date1);
        System.out.println("==================");
        str="01.11.2023";
        date1=dateParse(str);
        System.out.println(date1);
        System.out.println(date1.getDayOfWeek());

    }
    private static LocalDate dateParse(String date ){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("[dd/MM/yyyy][dd.MM.yyyy]");// определяем как преобразуется строка в дату
        return LocalDate.parse(date,df);// преобразовали в дату ISO
    }
}
