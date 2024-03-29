package lesson20;

public class StaticInitDemo {

    private static Car[] cars;

    static {
        cars = new Car[3];
        Car car = new Car("Bmw", 200);
        Car car1 = new Car("Seat", 300);
        Car car2 = new Car("Skoda", 150);
        cars[0] = car1;
        cars[1] = car;
        cars[2] = car2;
    }

    public StaticInitDemo() {
    }

    public void showAllCars() {
        System.out.println("Всего машин " + cars.length);
        System.out.print("[");
        for (Car carCurrent : cars) {
            System.out.println(carCurrent.getName() + " : " + carCurrent);
        }
        System.out.print("]\n");
    }

    public static void main(String[] args) {
        StaticInitDemo staticInitDemo = new StaticInitDemo();
        staticInitDemo.showAllCars();
    }


}
