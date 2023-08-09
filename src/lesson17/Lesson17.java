package lesson17;

public class Lesson17 {
    public static void main(String[] args) {
        Cat cat = new Cat("Max", 5.0);

        cat.whoAmI();
        cat.eat();
        cat.whoAmI();
        cat.run();
        cat.whoAmI();



        cat.startTraining(10);
        cat.whoAmI();
        Dog dog =new Dog("Rex",150);
        dog.jump();
        dog.training();
        dog.training();
        dog.training();
        System.out.println(dog.jumpHeight);
        System.out.println(dog.maxJumpHeight);

        int barrier =170;
        dog.getBarrier(barrier);

//        int[]barriers ={120,180,160,280,350,50}
    }
}
