package homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlanetAppl {
    public static void main(String[] args) {
        List<Planet> planets = new ArrayList<>();
        planets.add(new Planet("Mercury", 0.39, 0.055, 0));
        planets.add(new Planet("Venus", 0.72, 0.815, 0));
        planets.add(new Planet("Earth", 1.0, 1.0, 1));
        planets.add(new Planet("Mars", 1.52, 0.107, 2));
        planets.add(new Planet("Jupiter", 5.20, 317.8, 79));
        planets.add(new Planet("Saturn", 9.58, 95.1, 82));
        planets.add(new Planet("Uranus", 19.20, 14.5, 27));
        planets.add(new Planet("Neptune", 30.05, 17.1, 14));

        System.out.println("По порядку расположения в солнечной системе:");
        planets.sort(Comparator.comparingDouble(p -> planets.indexOf(p)));
        planets.forEach(System.out::println);

        System.out.println("\nПо алфавиту:");
        planets.sort(Comparator.comparing(p -> p.name));
        planets.forEach(System.out::println);

        System.out.println("\nПо массе:");
        planets.sort(Comparator.comparingDouble(p -> p.mass));
        planets.forEach(System.out::println);

        System.out.println("\nПо количеству спутников:");
        planets.sort(Comparator.comparingInt(p -> p.satellites));
        planets.forEach(System.out::println);
    }
}


