package homework_17;

public class Cube {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calculatePerimeter() {
        return 12 * side;
    }


    public double calculateSurfaceArea() {
        return 6 * side * side;
    }

    public double calculateVolume() {
        return side * side * side;
    }
}





