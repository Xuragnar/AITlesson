package homework24.runners;

public class SportsMan extends Human {

    public SportsMan() {
        super();
    }

    @Override
    public void setDefaultValues() {
        setSpeed(15);
        setRestTime(10);
    }

    @Override
    public void run() {
        System.out.println("Sportsman run with speed: " + getSpeed());
        rest();
    }

    @Override
    public void rest() {
        System.out.println("The sportsman began resting for a duration: " + getRestTime());
    }
}
