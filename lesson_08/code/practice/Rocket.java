package practice;

public class Rocket {
    public static void main(String[] args) throws InterruptedException {
        int countDown = 10;

        int counter = 0;

        while (countDown >= 0) {
            System.out.println("The rest to start " + countDown);
            countDown--;
            Thread.sleep(300);

        }
        System.out.println("Lets go");
    }
}
