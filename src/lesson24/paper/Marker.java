package lesson24.paper;

public class Marker extends Pen{

    @Override
    public void draw(String figure) {
        System.out.println("I am painting " +figure);
    }
}
