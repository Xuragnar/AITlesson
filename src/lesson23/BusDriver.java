package lesson23;

import java.util.Arrays;

public class BusDriver {
    private final int id;

    private String name;
    private String[] categories;
    private int age;
    static private int counter;

    public BusDriver(String name, int age) {
        this.name = name;
        this.age = age;
        this.categories = new String[1];
        categories[0] = "B";
        this.id=counter++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getCategories() {
        return categories;
    }

    public void addCategories(String categories){

    }

    public void removeCategories(String categories){

    }

    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String toString(){
        return "{id: " + id + "; name: " + name + "; categories: " + Arrays.toString(categories) + "}";
    }
}
