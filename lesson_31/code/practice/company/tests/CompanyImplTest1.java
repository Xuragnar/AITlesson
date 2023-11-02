package practice.company.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.company.dao.Company1;
import practice.company.dao.CompanyImpl1;
import practice.company.model.Employee1;
import practice.company.model.Manager1;
import practice.company.model.SalesManager1;
import practice.company.model.Worker1;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest1 {

    Company1 company;
    Employee1[] e;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl1(5);
        e = new Employee1[4];
        e[0] = new Manager1(101, "John", "Smith", 45, 160, 5000, 5);
        e[1] = new SalesManager1(102, "Anna", "Black", 36, 160, 25000, 0.1);
        e[2] = new SalesManager1(103, "Thomas", "White", 28, 160, 30000, 0.1);
        e[3] = new Worker1(104, "Gans", "Bauer", 30, 160, 5);

        // добавим элементы массива в company
        for (int i = 0; i < e.length; i++) {
            company.addEmployee(e[i]);
        }

    }

    @Test
    void addEmployee() {
        // не можем добавить null
        assertFalse(company.addEmployee(null));
        // не можем добавить второй раз, уже существующий
        assertFalse(company.addEmployee(e[1]));
        Employee1 employee1 = new Manager1(105, "Ivan", "Dubin", 55, 160, 6000, 6); // создали нового сотрудника
        assertTrue(company.addEmployee(employee1)); // добавили нового сотрудника
        assertEquals(5, company.quantity()); // теперь в компании 5 сотрудников
        // создаем еще одного нового
        Employee1 employee2 = new Manager1(106, "Peter", "Dubin", 55, 160, 6000, 6); // создали нового сотрудника
        assertFalse(company.addEmployee(employee2)); // не можем превысить capacity
    }

    @Test
    void removeEmployee() {
        // удаляем сотрудника
        assertEquals(e[1], company.removeEmployee(102));
        assertEquals(3, company.quantity()); // сотрудников стало на 1 меньше (4 - 1)
        assertNull(company.removeEmployee(102)); // дважды не можем удалить
        assertNull(company.findEmployee(102)); // не можем найти после удаления
    }

    @Test
    void findEmployee() {
        // ищем сотрудника по id
        assertEquals(e[1], company.findEmployee(102));
        // ищем несуществующего сотрудника
        assertNull(company.findEmployee(105));
    }

    @Test
    void quantityTest() {
        assertEquals(4, company.quantity());

    }

    @Test
    void totalSalaryTest() {
        assertEquals(12100., company.totalSalary(), 0.01);
    }

    @Test
    void avgSalaryTest() {
        assertEquals(12100.0 / 4, company.avgSalary(), 0.01);

    }

    @Test
    void totalSalesTest() {
        assertEquals(55000, company.totalSales());
    }

    @Test
    void printEmployees() {
        company.printEmployees();
    }

    @Test
    void findEmployeesHoursGreaterThan() {
        Employee1[] actual = company.findEmployeesHoursGreaterThan(100);
        Employee1[] expected = {e[0], e[1], e[2],e[3]};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findEmployeesSalaryRange() {
        company.printEmployees();
        Employee1[] actual = company.findEmployeesSalaryRange(2900,6000);
        Employee1[] expected = {e[0],e[2]};
        assertArrayEquals(expected, actual);
        System.out.println(Arrays.toString(actual));
    }
}