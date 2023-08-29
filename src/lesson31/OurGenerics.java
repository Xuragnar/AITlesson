package lesson31;

public class OurGenerics {

    // Обобщения,Дженерики Generics
    public static void main(String[] args) {
        Person<Integer> John = new Person<>("John",35);
        System.out.println(John.getName());
        System.out.println(John.getAge());

        Person<String >Bill=new Person<>("Bill","forty years");
        System.out.print(Bill.getName()+" ");
        System.out.println(Bill.getAge());


    }
}
