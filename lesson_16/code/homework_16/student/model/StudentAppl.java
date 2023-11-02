package homework_16.student.model;

public class StudentAppl {
    public static void main(String[] args) {
        Student student = new Student(1, "Alex", "Smith", 2000, "Menegment");
        student.display();
        student.study();
        student.exams();
        student.vocation();

Student student1 =new Student(2,"Tobias","Johnson",2003,"Chemistry");
        student1.display();
        student1.study();
        student1.exams();
        student1.vocation();
    }
}
