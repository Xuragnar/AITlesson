package homework24.runners;

public class MainSportsman {

    public static void main(String[] args) {

        Human human = new Human();
        SportsMan sportsman = new SportsMan();
        ProRunner proRunner = new ProRunner();

        Human[] runners = new Human[3];
        runners[0] = human;
        runners[1] = sportsman;
        runners[2] = proRunner;


        for (Human runner : runners) {
            runner.run();
        }

    }

}
