package homework19;

public class HWork19 {
    public static void main(String[] args) {
        Dog dog =new Dog("Rex",150);
        System.out.println(dog.getName());
        dog.setName("Bobik");
        dog.setJumpHeight(110);
        dog.setMaxJumpHeight(300);
        System.out.println(dog.getName());
        dog.whoAmI();
    }
}
