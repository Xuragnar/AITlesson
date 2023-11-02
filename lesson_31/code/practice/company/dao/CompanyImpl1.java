package practice.company.dao;

import practice.company.model.Employee1;
import practice.company.model.SalesManager1;

public class CompanyImpl1 implements Company1 {
    // поля, которые описывают компанию
    private Employee1[] employees; // массив для хранения сотрудников
    private int size; // текущее кол-во сотрудников в компании

    // конструктор
    public CompanyImpl1(int capacity) {
        employees = new Employee1[capacity]; // capacity - максимальный размер компании
    }

    @Override
    public boolean addEmployee(Employee1 employee) {
        if (employee == null || size == employees.length || findEmployee(employee.getId()) != null) {
            return false;
        }
        employees[size] = employee;// новый элемент
        size++;
        return true;
    }

    @Override
    public Employee1 removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {
                Employee1 victim = employees[i];
                employees[i] = employees[size - 1];// на место найденного поставили последнего
                //существующего в массиве
                employees[size - 1] = null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Employee1 findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id) {// нашелся элемент массива у которого совпал id
                return employees[i];//вернули найденный элемент в массиве Employee
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public double totalSalary() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            res += employees[i].calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {
        return totalSalary() / size;
    }

    @Override
    public double totalSales() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof SalesManager1) {
                SalesManager1 salesManager1 = (SalesManager1) employees[i]; // провели кастинг
                res += salesManager1.getSalesValue();
            }
        }
        return res;
    }


    @Override
    public void printEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    //  Для выборки элементов из массива, удовлетворяющих заданному условию, надо:
    //        - сначала подсчитать количество элементов массива, удовлетворяющих условию.
    //        - потом создать массив под это количество,
    //        - и только потом его заполнить.
    @Override
    public Employee1[] findEmployeesHoursGreaterThan(int hours) {
        int count = 0;
        //считаем сколько элементов массива удовлетворяющих условию
        for (int i = 0; i < size; i++) {
            if (employees[i].getHours() > hours) {
                count++;
            }
        }
        Employee1[] res = new Employee1[count];// создаем массив размером count
        // заполняем массив res
        for (int i = 0, j = 0; j < res.length; i++) {
            if (employees[i].getHours() > hours) {
                res[j++] = employees[i];
            }
        }
        return res;// это возвращаемый массив
    }

    @Override
    public Employee1[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].calcSalary() > minSalary && employees[i].calcSalary() < maxSalary) {
                count++;
            }
        }
        Employee1[] res = new Employee1[count];
        for (int i = 0, j = 0; j < res.length; i++) {
            if (employees[i].calcSalary() > minSalary && employees[i].calcSalary() < maxSalary) {
                res[j++] = employees[i];
            }
        }
        return res;
    }
}
