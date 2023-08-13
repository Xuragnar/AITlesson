package homework19;

public class Dog {

    private String name;
    private int jumpHeight;

    private int maxJumpHeight;

    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.maxJumpHeight = 2 * jumpHeight;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJumpHeight() {
        return this.jumpHeight;
    }

    public void setJumpHeight(int jumpHeight) {
        this.jumpHeight = jumpHeight;
    }

    public int getMaxJumpHeight() {
        return this.maxJumpHeight;
    }

    public void setMaxJumpHeight(int maxJumpHeight) {
        this.maxJumpHeight = maxJumpHeight;
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
        System.out.println("End get barrier ." + jumpHeight);

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
        System.out.println("I am dog " + name + ". I am jumping " + jumpHeight + "cm. " + maxJumpHeight + "" + " my max jump");
    }
}
