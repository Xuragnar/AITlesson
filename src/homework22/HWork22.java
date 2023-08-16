package homework22;

public class HWork22 {
    public static void main(String[] args) {
        Animal animal = new Animal("Lion", 15, "Africa");
        System.out.println(animal.toString());
        animal.eatForPredator();
        animal.setSpeed(11);
        System.out.println(animal.toString());

        Animal animal1 = new Animal("Cheetah", 60, "Africa");
        animal1.eatForPredator();
        System.out.println(animal1.toString());

        Animal animal2 = new Animal("Elephant", 10, "India");
        animal2.eatForHerbivorous();
        System.out.println(animal2.toString());
    }


}
