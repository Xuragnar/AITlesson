package practice.company.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.company.dao.Company1;
import practice.company.dao.CompanyImpl;
import practice.company.model.Employee1;
import practice.company.model.Manager1;
import practice.company.model.SalesManager1;
import practice.company.model.Worker1;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    Company1 company1;
    Employee1[] employee;

    @BeforeEach
    void setUp() {
        company1 = new CompanyImpl(5);
        employee = new Employee1[4];
        employee[0] = new Manager1(101, "John", "Smith", 45, 160, 5000, 5);
        employee[1] = new SalesManager1(102,"Anna", "Black", 36, 160, 25000, 0.1);
        employee[2] = new SalesManager1(103,"Thomas", "White", 28, 160, 30000, 0.1);
        employee[3] = new Worker1(104, "Gans", "Bauer", 30, 160, 5);
    }

    @Test
    void addEmployee() {
        // не можем добавить null
        assertFalse(company1.addEmployee(null));
        // не можем добавить второй раз, уже существующий
        assertFalse(company1.addEmployee(employee[1]));
        Employee1 employee1 = new Manager1(105, "Ivan", "Dubin", 55, 160, 6000, 6); // создали нового сотрудника
        assertTrue(company1.addEmployee(employee1)); // добавили нового сотрудника
        assertEquals(5, company1.quantity()); // теперь в компании 5 сотрудников
        // создаем еще одного нового
        Employee1 employee2 = new Manager1(106, "Peter", "Dubin", 55, 160, 6000, 6); // создали нового сотрудника
        assertFalse(company1.addEmployee(employee2)); // не можем превысить capacity
    }

    @Test
    void removeEmployee() {
        // удаляем сотрудника
        assertEquals(employee[1] , company1.removeEmployee(102));
        assertEquals(3, company1.quantity()); // сотрудников стало на 1 меньше (4 - 1)
        assertNull(company1.removeEmployee(102)); // дважды не можем удалить
        assertNull(company1.findEmployee(102)); // не можем найти после удаления
    }

    @Test
    void findEmployee() {
        // ищем сотрудника по id
        assertEquals( employee[1], company1.findEmployee(102));
        // ищем несуществующего сотрудника
        assertNull(company1.findEmployee(105));
    }

    @Test
    void quantity() {


    }

    @Test
    void totalSalary() {


    }

    @Test
    void avgSalary() {


    }

    @Test
    void totalSales() {
    }

    @Test
    void printEmployees() {


    }
}