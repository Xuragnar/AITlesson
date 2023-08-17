package homework23;

public class HWork23 {
    public static void main(String[] args) {
        Hair hair = new Hair("yellow", 7);
        Head head = new Head(30, "Oval");
        Herbivorous herbivorous = new Herbivorous("Jiraf", 15, "Africa", hair, head);

        Hair hair2 = new Hair("Black", 20);
        herbivorous.setHair(hair2);
        herbivorous.setHabitat("Europe");

       // System.out.println(herbivorous.getHair().getColor());
        System.out.println(herbivorous.toString());



    }
}
