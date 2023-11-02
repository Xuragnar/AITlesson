package practice.company.dao;

//    - добавить сотрудника
//    - удалить сотрудника
//    - найти сотрудника
//    - кол-во сотрудников
//    - ФОТ
//    - средняя з/п
//    - объем продаж
//    - напечатать список сотрудников

import practice.company.model.Employee1;

public interface Company {
   // объявляем методы, только сигнатуры, без тела метода
   boolean addEmployee(Employee1 employee);
   Employee1 removeEmployee(int id);
   Employee1 findEmployee(int id);
   int quantity();
   double totalSalary(); // - ФОТ, зарплата всех
   double avgSalary(); // средняя зарплата по компании, average - средний
   double totalSales(); // - объем продаж
   void printEmployees();

}