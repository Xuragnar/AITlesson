package homework_03;

public class HW_03 {
    public static void main(String[] args) {
        double a = areaOfASquare(5);
        double r = circleLength(25);
        double k = areaOfTriangle(10,10);
        System.out.println("Circlelength = " + r);
        System.out.println("Areaofasquare = " + a);
        System.out.println("Areaoftriangle = " + k);

    }
    public static double areaOfTriangle(double a,double b){
        double k = a * b;
        return k;
    }
    public static double areaOfASquare(double side) {
        double s = 4  * side;
        return s;
    }
    public static double circleLength(double radius) {
        double l = 2 * radius * Pi();
        return l;
    }
    public static double Pi() {
        double pi = 3.1415926;
        return pi;
    }
}
