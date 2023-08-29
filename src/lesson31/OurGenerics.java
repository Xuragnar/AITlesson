package lesson31;

public class OurGenerics {

    // Обобщения,Дженерики Generics
    public static void main(String[] args) {
        Person<Integer> John = new Person<>("John", 35);
        System.out.println(John.getName());
        System.out.println(John.getAge());

        Person<String> Bill = new Person<>("Bill", "forty years");
        System.out.print(Bill.getName() + " ");
        System.out.println(Bill.getAge());

        Printer printer = new Printer();

        Integer[] ints = {1, 2, 3, 4, 5};
        String[] strings = {"a", "b", "c"};

        printer.<Integer>printArray(ints);
        System.out.println();
        printer.<String>printArray(strings);

        //обобщенные интерфейсы

        //несколько универсальных параметров

        Person2<Integer, String> ann = new Person2<>("Ann", 23);
        System.out.println(ann.getName());
        System.out.println(ann.getAge());

        //обобщенные кончтрукторы
        // В этом случае перед конструктором также указывают в угловых скобках универсальные
    }
}
