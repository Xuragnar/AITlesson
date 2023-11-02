package homework.model;

public class Triangle extends Shape {
    public Triangle(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return (3*side ) / 2 *side;
    }

    @Override
    public double calcPerimeter() {
        return 3 * side;
    }
}
