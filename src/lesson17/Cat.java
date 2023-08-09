package lesson17;

public class Cat {
    String name;
    double weight;

    public Cat(String catName, double weight) {
        name = catName;
        this.weight = weight;
    }

    void startTraining(int laps) {
        System.out.println("Start training " + laps + " rounds");
        for (int i = 0; i < laps; i++) {
            System.out.println("Round # " + (i + 1));
            run();
            System.out.println("end lap \n");
        }
    }

    void run() {
        while (weight <= 2) {
            System.out.println("I cant RUN!!!" + weight);
            eat();
            System.out.println("My weight after food " + weight);

        }

        System.out.println("I am running ....");
        weight -= 2;
    }


    void eat() {
        System.out.println("I am eating");
        weight++;
    }

    void whoAmI() {
        System.out.println("I am cat " + name + " my weight is " + weight + " kg");
    }

}
