package company_v2;

import company_v2.model.Employee;
import company_v2.model.Manager;
import company_v2.model.SalesManager;
import company_v2.model.Worker;


public class EmployeeAppl {
    public static void main(String[] args) {

        Employee[] empl = new Employee[4];
        empl[0] = new Manager(100, "John", "Smith", 45, 160, 5000, 5,6,"higher");
        empl[1] = new SalesManager(101,"Anna", "Black", 36, 160, 25000, 0.1,9,"higher");
        empl[2] = new SalesManager(102,"Thomas", "White", 28, 160, 30000, 0.1,5,"higher");
        empl[3] = new Worker(103, "Gans", "Bauer", 30, 80, 5,3,"middle");

//        e[0] = new Manager(101, "John", "Smith", 45, 160, 5000, 5);
//        e[1] = new SalesManager(102, "Anna", "Black", 36, 160, 25000, 0.1);
//        e[2] = new SalesManager(103, "Thomas", "White", 28, 160, 30000, 0.1);
//        e[3] = new Worker(104, "Gans", "Bauer", 30, 80, 5);


        double total = totalSalary(empl); // вызываем метод для расчета зарплаты
        System.out.println("Total salary: " + total);
        double average = averageAge(empl);
        System.out.println("Average age: " + average);
        double totalSales = totalSales(empl);
        System.out.println(totalSales);

    }

    private static double totalSalary(Employee[] empl){
        double sum = 0;
        for (int i = 0; i < empl.length; i++) {
            if(empl[i] != null){
                sum += empl[i].calcSalary();
            }
        }
        return sum;
    }

    private static double averageAge(Employee[] empl) {
        double average = 0;
        for (int i = 0; i < empl.length; i++) {
            if(empl[i] != null){
                average += empl[i].getAge();
            }
        }
        return average / empl.length;
    }

    private static double totalSales(Employee[] empl){
        double sum = 0;
        for (int i = 0; i < empl.length; i++) {
            if(empl[i] instanceof SalesManager){
                SalesManager salesManager = (SalesManager) empl[i];
                sum += salesManager.getSalesValue();
            }
        }
        return sum;
    }

}
