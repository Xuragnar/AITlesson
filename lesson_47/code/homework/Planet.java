package homework;

public class Planet {
    String name;
    double distance;
    double mass;
    int satellites;

    Planet(String name, double distance, double mass, int satellites) {
        this.name = name;
        this.distance = distance;
        this.mass = mass;
        this.satellites = satellites;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", distance=" + distance +
                ", mass=" + mass +
                ", satellites=" + satellites +
                '}';
    }
}

