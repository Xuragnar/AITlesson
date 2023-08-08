package homework14;

public class Driver {
    String name;
    int age;
    int experience;

    public Driver(String name, int age,int experience){
        if (experience>age){
            System.out.println("Обман");
        }
        this.name=name;
        this.age=age;
        this.experience=experience;
    }
    void sayName (){
        System.out.println("My name is: "+this.name);
    }
    void sayAge(){
        System.out.println("My age is: "+ this.age);
    }
}
