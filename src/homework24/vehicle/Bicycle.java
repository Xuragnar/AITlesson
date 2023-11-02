/*package homework24.vehicle;

public class Bicycle extends homework24.vehicles.Vehicle {
    public Bicycle(String title) {
        super(title);
    }

    @Override
    public void setDefaultValues() {
        // переопределение родительского метода пустотой, чтобы изменить поведение "создать новый двигатель"  this.engine = new Engine();
    }

    @Override
    public void setEngine(homework24.vehicles.Engine engine) {
        // тоже переопределение родительского метода, чтобы велосипеду не добавлялся двигатель
        System.out.println("I don't have space for an engine");
    }

    @Override
    public String toString() {
        return "Bicycle {" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                '}';
    }
}
*/