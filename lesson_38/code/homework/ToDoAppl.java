package homework;

import java.util.List;
import java.util.Scanner;

public class ToDoAppl {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList() {
            @Override
            public void addTask(String task) {

            }

            @Override
            public List<Task> getAllTasks() {
                return null;
            }

            @Override
            public void deleteTask(int taskNumber) {

            }
        };
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Welcome to the 'To-Do List' app!");

        while (true) {
            printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter a new task: ");
                    String task = scanner.nextLine();
                    toDoList.addTask(task);
                    System.out.println("Task added.");
                    break;
                case 2:
                    List<Task> tasks = toDoList.getAllTasks();
                    if (tasks.isEmpty()) {
                        System.out.println("The task list is empty.");
                    } else {
                        System.out.println("All tasks:");
                        for (Task t : tasks) {
                            System.out.println(t);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter the number of the task to be deleted: ");
                    int taskNumber = scanner.nextInt();
                    toDoList.deleteTask(taskNumber);
                    System.out.println("Task deleted.");
                    break;
                case 4:
                    System.out.println("Bye !");
                    System.exit(0);
                default:
                    System.out.println("Incorrect selection. Try again.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("Menu:");
        for (MenuOption option : MenuOption.values()) {
            System.out.println(option.getValue() + ". " + option.getDescription());
        }
        System.out.print("Select an action: ");
    }
}


