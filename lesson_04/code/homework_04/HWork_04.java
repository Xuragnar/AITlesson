package homework_04;

public class HWork_04 {
    public static void main(String[] args) {

        System.out.println("Formula of Volume: " + Volume(5));
        System.out.println("Surface Area: " + Square(2));
        System.out.println("Trianglesquare:"+triangleSquare(3,3));
    }
    public static int Volume(int a) {
        return a * a * a;
    }
    public static int Square(int a) {
        return 6 * a * a;
    }
    public static double triangleSquare(double a, double h) {
        return 0.5 * a * h;
    }
}
