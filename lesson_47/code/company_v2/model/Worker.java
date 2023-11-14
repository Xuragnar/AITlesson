package company_v2.model;

public class Worker extends Employee {
    private double grade;

    public Worker(int id, String firstName, String lastName, int age, double hours, double grade,double experience,String education ) {
        super(id, firstName, lastName, age, hours,experience,education);
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
