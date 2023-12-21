package practice.tarakan_race;

import java.util.Random;

public class Tarakan implements Runnable{
    String name;

    static int distance;
    static int minSleepTime = 1;
    static int maxSleepTime = 5;
    static String winner;
    static Random random = new Random();

    public Tarakan(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getDistance() {
        return distance;
    }

    public static void setDistance(int distance) {
        Tarakan.distance = distance;
    }

    public static int getMinSleepTime() {
        return minSleepTime;
    }

    public static void setMinSleepTime(int minSleepTime) {
        Tarakan.minSleepTime = minSleepTime;
    }

    public static int getMaxSleepTime() {
        return maxSleepTime;
    }

    public static void setMaxSleepTime(int maxSleepTime) {
        Tarakan.maxSleepTime = maxSleepTime;
    }

    public static String getWinner() {
        return winner;
    }

  //  public static void setWinner(String winner) {
  //      Tarakan.winner = winner;
  //  }

    @Override
    public void run() {
        for (int i = 0; i < distance; i++) {
            int sleepTime = maxSleepTime+random.nextInt(maxSleepTime+1-minSleepTime);
            try {
                Thread.sleep(sleepTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(name + " is moving ");
        }
            System.out.println(name + " FINISHED ");
        if(winner==null){
            winner=name;
        }
    }
}
