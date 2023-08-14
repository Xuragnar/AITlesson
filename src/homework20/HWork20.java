package homework20;



public class HWork20 {
    public static void main(String[] args) {
        Dog dog1 = new Dog(" Barbos ", 50);

        for (int i = 0; i < 7; i++) {
            dog1.training();

        }

        System.out.println("**********");

        System.out.println("name " + dog1.getName());
        System.out.println(" jumpHeight " + dog1.getJumpHeight());
        System.out.println(" maxJumpHeight " + dog1.getMaxJumpHeight());
        Dog dog = new Dog("As", 100);
        dog.jump(2);
        dog1.jump(2);
        System.out.println("Всего прыжков " + Dog.getJumpTotal());

        System.out.println(dog.getMaxJumpHeight());
        dog.getMaxJumpHeight();

        System.out.println("******Rax*******");
        dog = new Dog("Rax", 150);


        //int barrier = 120;
        //dog.getBarrier(barrier);

        // barrier = 180;
        // dog.getBarrier(barrier);

        int[] barriers = {120, 180, 160, 280, 350, 50};
        for (int barrier : barriers) {
            dog.getBarrier(barrier);
        }

    }

}




