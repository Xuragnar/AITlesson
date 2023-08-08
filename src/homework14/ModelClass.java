package homework14;

public class ModelClass {


    String model;
    int stages;
    int age;

    public ModelClass(int age, int stages, String model) {
        this.model = model;
        this.stages = stages;
        this.age = age;
    }

    void go() {
        System.out.println("Pognale");
    }

    int getAge() {
        return this.age;
    }

    String getInfo() {
        return "Car model: " + this.model  + "\nAge: " + this.age + "\nStage: " + this.stages;
    }
}
