package lesson16;

public class CatClass {
    String name;
    String color;
    int age;

    public CatClass(int age) {
        this.age = age;
    }

    public CatClass(int age, String name) {
        this.age = age;
        this.name = name;

    }

    public CatClass(int catAge, String catName, String CatColor) {
        this.age = catAge;
        this.name = catName;
        this.color = CatColor;

    }

    public CatClass() {

    }


    void sayMeow() {
        System.out.println("Meow!!!");
    }

    void sleep() {
        System.out.println("I am sleeping ");
    }

    void running() {
        System.out.println("i am running!!");
    }
}
