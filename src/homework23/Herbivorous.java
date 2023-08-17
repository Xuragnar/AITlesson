package homework23;

public class Herbivorous extends Animal {
    private Hair hair;
    private Head head;


    public Herbivorous(String name, int speed, String habitat, Hair hair, Head head) {
        super(name, speed, habitat);
        this.hair = hair;
        this.head = head;
    }

    public void run() {
        System.out.println("Running");
    }

    static void getTaxonomyName() {
        System.out.println("Herbivorous");
    }

    public Hair getHair() {
        return hair;
    }

    public void setHair(Hair hair) {
        this.hair = hair;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }
    public String toString(){
        return "Head: " + this.head.toString() + " Hair " + this.hair.toString() + " " + super.toString();
    }
}
