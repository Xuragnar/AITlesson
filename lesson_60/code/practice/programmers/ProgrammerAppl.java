package practice.programmers;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class ProgrammerAppl {
    //Необходимо ответить на вопросы
    //1. Кто из программистов знает больше всего языков
    // Ф.И. -> кол-во языков
    //2. Какие языки пользуются популярностью среди наших программистов
    // язык программирования - сколько программистов его знают
    public static void main(String[] args) {

        List<Programmer> programmers = getProgrammers();

        System.out.println("============== Most skilled programmers==============");
        printMostSkilledProgrammers(programmers);

        System.out.println("===========Most popular technologies========");
        printMostPopularTechnologies(programmers);

    }

    private static void printMostPopularTechnologies(List<Programmer> programmers) {
        System.out.println("=============Print all technologies==========");
        Iterable<String> technologies = programmers.stream()
                .map(p -> p.getTechnologies())//преобразование объекта programmer в одно его поле с массивом технологий
                .flatMap(t -> Arrays.stream(t))// каждый из массивов преобразуем в отдельный стрим
                .collect(Collectors.toList());// собираем результат стримов в лист

        StreamSupport.stream(technologies.spliterator(),false)
                .distinct()
                .forEach(System.out::println);

        System.out.println("===========Grouping By Programmers============");
        Map<String,Long>techFrequency=programmers.stream()
                .map(Programmer::getTechnologies)
                .flatMap(Arrays::stream)
                .collect(Collectors.groupingBy(t->t,Collectors.counting()));

        System.out.println(techFrequency);
        Long max = techFrequency.values().stream()
                .max(Long::compare).orElse(0L);

        techFrequency.entrySet().stream()
                .filter(e->max.equals(e.getKey()))
                .forEach(e-> System.out.println(e.getKey()));
    }

    private static void printMostSkilledProgrammers(List<Programmer> programmers) {
        Map<Integer, List<Programmer>> skilledProgrammers = programmers.stream()
                .collect(Collectors.groupingBy(p -> p.getTechnologies().length));


        Integer max = skilledProgrammers.keySet().stream()
                .max(Integer::compareTo).orElse(0);
        skilledProgrammers.get(max).forEach(System.out::println);


        // Map<Integer, List<Programmer>> skilledProgrammers = new HashMap<>();
        //      int max = 0;
        //      for (Programmer programmer : programmers) {
        //          int key = programmer.getTechnologies().length;// это ключ для мапы
        //          max = key > max ? key : max;//обновили мах если он стал больше в ходе выполнения цикла
        //          skilledProgrammers.putIfAbsent(key, new ArrayList<>());// если такой ключ встретился в 1-й раз то создаем пустой лист
        //         List<Programmer> programmerList = skilledProgrammers.get(key);
        //         programmerList.add(programmer);
        //    }
        //   System.out.println(skilledProgrammers);
    }

    private static List<Programmer> getProgrammers() {
        return List.of(
                new Programmer("Peter", "C++", "Python", "Java", "Kotlin"),
                new Programmer("John", "Python", "Java"),
                new Programmer("Helen", "Kotlin", "Scala", "Java", "JavaScript"),
                new Programmer("Jacob", "Python", "Go"),
                new Programmer("Mikhail", "Fortran", "Algol", "PL-1")
        );
    }


}
