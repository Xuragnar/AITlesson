package homework24.vehicles;

public class Auto extends Vehicle{
    public Auto(String title) {
        super(title);
    }

    @Override
    public String toString() {
        return "Auto {" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", engine=" + getEngine() +
                '}';
    }
}
