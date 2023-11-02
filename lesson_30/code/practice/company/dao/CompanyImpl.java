package practice.company.dao;

import practice.company.model.Employee1;

public class CompanyImpl implements Company1 {
    // поля, которые описывают компанию
    private Employee1[] employees; // массив для хранения сотрудников
    private int size; // текущее кол-во сотрудников в компании

    // конструктор
    public CompanyImpl(int capacity){
        employees = new Employee1[capacity]; // capacity - максимальный размер компании
    }

    @Override
    public boolean addEmployee(Employee1 employee) {
        return false;
    }

    @Override
    public Employee1 removeEmployee(int id) {
        return null;
    }

    @Override
    public Employee1 findEmployee(int id) {
        return null;
    }

    @Override
    public int quantity() {
        return 0;
    }

    @Override
    public double totalSalary() {
        return 0;
    }

    @Override
    public double avgSalary() {
        return 0;
    }

    @Override
    public double totalSales() {
        return 0;
    }

    @Override
    public void printEmployees() {

    }

    @Override
    public Employee1[] findEmployeesHoursGreaterThan(int hours) {
        return new Employee1[0];
    }

    @Override
    public Employee1[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        return new Employee1[0];
    }
}
