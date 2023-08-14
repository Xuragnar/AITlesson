package homework20;

public class Dog {
    private static int jumpTotal ;
    private String name;
    private int jumpHeight;
    private int maxJumpHeight;


    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = jumpHeight * 2;
    }
    public static int getJumpTotal(){
        return jumpTotal;
    }

    public String getName() {
        return name;
    }


    public int getJumpHeight() {
        return jumpHeight;
    }

    public int getMaxJumpHeight() {

        return maxJumpHeight;
    }

    void whoAmi() {
        System.out.println("Я собака " + name + ", и умею прыгать на" + jumpHeight + "см ");
    }

    void jump() {
        jumpTotal++;

        System.out.println(" я прыгаю " );
    }


    void jump(int height) {
        jumpTotal++;
        System.out.println("Я перепрыгиваю барьер " + height + "см ");
    }




    void getBarrier(int barrierHeight) { // 100,200,150

        if (barrierHeight <= maxJumpHeight && jumpHeight < barrierHeight) {
            while (jumpHeight < barrierHeight) {
                training();
            }
        }

        if (jumpHeight >= barrierHeight) {
            jump(barrierHeight);
        } else {
            System.out.println("Я не могу перепрыгнуть барьер высотой " + barrierHeight);
        }
        System.out.println("End get barrier.Текуший прыжок " + jumpHeight);
    }

    void training() {
        if (jumpHeight + 10 <= maxJumpHeight) { //50 -> 100-> x <=100 -10(90)
            jumpHeight += 10;
            System.out.println("Я потренировался !");
            whoAmi();
        } else {
            System.out.println("Больще натренировать не могу ");
        }
    }

}

