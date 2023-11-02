package practice.employee;

import practice.employee.model.Employee;

public class FirmaApllication {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Serhii", "Makeiev", 36, 4500.20, true);
        employee.display();
        Employee employee1 = new Employee(2, "John", "Smith", 31, 3500.20, true);
        employee1.display();
        double totalSalary = employee.getSalary() + employee1.getSalary();
        System.out.println("Total salary :" + totalSalary);
    }
}
