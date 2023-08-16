package homework22;

public class Predator extends Animal{
    public Predator(String name, int age, String habitat) {
        super(name, age, habitat);

    }
    public void goToEat(){
        System.out.println("Я хочу есть !");
    }

}
