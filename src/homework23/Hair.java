package homework23;

public class Hair {

    private String color;
    private int length;

    public Hair(String color, int length) {
        this.color = color;
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String toString(){
        return "Color: " + this.color + " Length: " + this.length ;
    }
}
