package lesson16;

public class Lesson16 {
    public static void main(String[] args) {

        CatClass cat = new CatClass();

        cat.sayMeow();
        System.out.println(cat.age);

        CatClass cat1= new CatClass(5);
        System.out.println(cat1.age);
        System.out.println(cat1.name);


        CatClass cat2 = new CatClass(3,"Max");

        cat2.sayMeow();
        cat2.running();
        System.out.println("Cat name: " + cat2.name);
        System.out.println("Cat age: " + cat2.age);



        CatClass catBoris= new CatClass(5,"Boris","Red");

        catBoris.sleep();
        System.out.println("Cat name " + catBoris.name);
        System.out.println("Cat age " + catBoris.age);
        System.out.println("Cat color " + catBoris.color);
    }


}
