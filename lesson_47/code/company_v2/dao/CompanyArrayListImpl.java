package company_v2.dao;

import company_v2.model.Employee;
import company_v2.model.SalesManager;

import java.util.ArrayList;
import java.util.List;

public class CompanyArrayListImpl implements Company {
    // поля, которые описывают компанию
    //  private Employee[] employees; // сотрудники - массив для хранения сотрудников
    //   private int size; // текущее кол-во сотрудников в компании

    List<Employee> employees; // Вместо массива делаем List
    int capacity;// вместимость компании

    //   public CompanyImpl(int capacity) {
    //      employees = new Employee[capacity]; // capacity - максимальный размер компании
    //  }
    public CompanyArrayListImpl(int capacity) {
        employees = new ArrayList<>();//длину (размер) указывать не надо
        this.capacity = capacity;
    }


    @Override
    public boolean addEmployee(Employee employee) {
        if (employee == null || employees.size() == capacity || findEmployee(employee.getId()) != null) {
            return false;
        }
        employees.add(employee);
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        //      for (int i = 0; i < size; i++) {
        //          if (employees[i].getId() == id) {
        //              Employee victim = employees[i]; // убрали найденный элемент в переменную
        //              employees[i] = employees[--size]; // - префиксная операция
        //               employees[size] = null; // обнуляем последний элемент
        //               return victim;
        //           }
        //       }
        //       return null;
        Employee victim = findEmployee(id);
        if (victim != null) {
            employees.remove(victim);
            return victim;
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        //      for (int i = 0; i < size; i++) {
        //          if (employees[i].getId() == id) { // нашелся элемент массива, у которого совпал id
        //              return employees[i]; // вернули найденный элемент массива типа Employee
        //          }
        //      }
        //      return null;
        for (Employee e : employees) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return employees.size();
    }

    @Override
    public double totalSalary() {
        double res = 0;
        for (Employee e : employees) {
            res += e.calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {
        return totalSalary() / employees.size();
    }

    @Override
    public double totalSales() {
        double res = 0;
        for (Employee e : employees) {
            if (e instanceof SalesManager) {
                SalesManager salesManager = (SalesManager) e;
                res += salesManager.getSalesValue();
            }
        }
        return res;
    }

    @Override
    public void printEmployees() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        return new Employee[0];
    }

    @Override
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        return new Employee[0];
    }
}
