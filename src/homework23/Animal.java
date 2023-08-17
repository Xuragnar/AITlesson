package homework23;

public class Animal {

    private String name;
    private int speed;
    private String habitat;


    public Animal(String name, int speed, String habitat) {
        this.name = name;
        this.speed = speed;
        this.habitat = habitat;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void eatForPredator() {
        System.out.println("Я ем только мясо");
    }

    public void eatForHerbivorous() {
        System.out.println("Я ем только траву");
    }



    public String toString() {
        return "Название животного: " + name + ", Я бегаю со скоростью " + speed + ", Ареал обитания " + habitat ;
    }
}
