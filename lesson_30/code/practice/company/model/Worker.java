package practice.company.model;

public class Worker extends Employee1 {
    private double grade;

    public Worker(int id, String firstName, String lastName, int age, double hours, double grade) {
        super(id, firstName, lastName, age, hours);
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    @Override
    public double calcSalary() {
        double salary = hours * grade;
        return salary;
    }
}
