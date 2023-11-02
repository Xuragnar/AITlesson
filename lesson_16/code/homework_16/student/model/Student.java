package homework_16.student.model;

public class Student {
    private int id;
    private String name;
    private String lastName;
    private int yearOfBirth;
    private String specialisation;


    public Student(int id, String name, String lastName, int yearOfBirth, String specialisation) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
        this.specialisation = specialisation;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public void display() {
        System.out.println(" ID: " + id + "\n Name: " + name + "\n Last Name :"
                + "\n Year of birth: " + yearOfBirth + "\n Specialisation: " + specialisation);
    }

    public void study(){
        System.out.println("I am studying");
    }
    public void vocation(){
        System.out.println("Yoohoo vocation!!!!!Best time!!");
    }
    public void exams(){
        System.out.println("I'll pass all exams!! ");
    }
}

