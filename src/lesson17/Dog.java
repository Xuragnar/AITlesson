package lesson17;

public class Dog {
    //    Написать класс собака Собака должна иметь имя, высоту прыжка
//    Должна уметь прыгать и должна уметь тренироваться.
//    За каждую тренировку высота прыжка увеличивается на 10 сантиметров
//    Максимальная высота, которую может натренировать собака не может быть больше,
//    чем 2раза высоту первоначального прыжка.
    String name;
    int jumpHeight;

    int maxJumpHeight;

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = 2 * jumpHeight;
    }

    void jump() {
        System.out.println("I am jumping");
    }

    void jump(int height) {
        System.out.println("I can jump " + height + " cm ");
    }

    void getBarrier(int barrierHeight) {
        if (barrierHeight <= maxJumpHeight && jumpHeight < barrierHeight) {
            while (jumpHeight <= barrierHeight) {
                training();
            }
        }
        if (barrierHeight <= jumpHeight) {
            jump(barrierHeight);
        } else {

        System.out.println("I cant jump" + barrierHeight);
        }
        System.out.println("End get barrier ." +jumpHeight);

    }



    void training() {
        System.out.println("Start training");
        if (jumpHeight + 10 <= maxJumpHeight) {

            jumpHeight += 10;
            System.out.println("I am training!");
            whoAmI();

        } else {
            System.out.println("Bolbwe ne mogy");
        }


    }

    void whoAmI() {
        System.out.println("I am dog " + name + "i am jumping " + jumpHeight + "cm");
    }

}
