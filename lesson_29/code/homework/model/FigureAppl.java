package homework.model;

public class FigureAppl {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(2);
        shapes[1] = new Circle(3);
        shapes[2] = new Triangle(4);
        shapes[3] = new Square(5);

        double total = totalArea(shapes);
        System.out.println("Total area: " + total);
        double totalP= totalPerimeter(shapes);
        System.out.println("Total perimeter: " + totalP);
        double totalCircle=totalAreaCircle(shapes);
        System.out.println(totalCircle);

    }

    private static double totalAreaCircle(Shape[]shapes){
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i] instanceof Circle){
                sum+=shapes[i].calcArea();
            }
        }
        return sum;
    }

    private static double totalArea(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null) {
                sum += shapes[i].calcArea();
            }
        }
        return sum;
    }

    private static double totalPerimeter(Shape[] shapes) {
        double sum = 0;
        for (int i = 0; i < shapes.length; i++) {
            if(shapes[i]!=null){
                sum+=shapes[i].calcPerimeter();
            }
        }
        return sum;
    }
}
