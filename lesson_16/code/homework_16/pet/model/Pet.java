package homework_16.pet.model;

public class Pet {
    private int id;
    private String type;
    private int age;
    private String nickname;

    public Pet(int id, String type, int age, String nickname) {
        this.id = id;
        this.type = type;
        this.age = age;
        this.nickname = nickname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void display() {
        System.out.print(" ID: " + id + "\n Type: " + type + "\n Age: " + age + "\n Nickname: " + nickname);
    }

    public void sleeping() {
        System.out.println("Animal sleeping");
    }

    public void eating() {
        System.out.println("Animal eating");
    }

    public void sound() {
        System.out.println("Animal do some sound");
    }

    public void playing() {
        System.out.println("Animal playing");
    }

    public void walking() {
        System.out.println("Animal playing");
    }
}
