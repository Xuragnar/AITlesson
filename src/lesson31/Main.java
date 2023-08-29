package lesson31;

public class Main {
    public static void main(String[] args) {
        Person person1=new Person("John",25);
        System.out.println(person1.getAge());
        System.out.println(person1.getName());

        Person person2=new Person("John2","twenty five");
        System.out.println(person2.getName());
        System.out.println(person2.getAge());
    }
}
