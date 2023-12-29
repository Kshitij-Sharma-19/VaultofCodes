import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListApp {
    
    private static ArrayList<String> toDoList = new ArrayList<>();

    
    private static void addTask(String task) {
        toDoList.add(task);
        System.out.println("Task added: " + task);
    }

    
    private static void deleteTask(int index) {
        if (index >= 0 && index < toDoList.size()) {
            String removedTask = toDoList.remove(index);
            System.out.println("Task removed: " + removedTask);
        } else {
            System.out.println("Invalid index. Task not removed.");
        }
    }

    
    private static void displayTasks() {
        if (toDoList.isEmpty()) {
            System.out.println("No tasks in the to-do list.");
        } else {
            System.out.println("To-Do List:");
            for (int i = 0; i < toDoList.size(); i++) {
                System.out.println((i + 1) + ". " + toDoList.get(i));
            }
        }
    }

    
    private static void markAsComplete(int index) {
        if (index >= 0 && index < toDoList.size()) {
            String task = toDoList.get(index);
            toDoList.set(index, "[Completed] " + task);
            System.out.println("Task marked as complete: " + task);
        } else {
            System.out.println("Invalid index. Task not marked as complete.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("\n=== To-Do List Application ===");
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Display Tasks");
            System.out.println("4. Mark Task as Complete");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            
            // Get user input
            choice = scanner.nextInt();
            scanner.nextLine(); 

            
            switch (choice) {
                case 1:
                    System.out.print("Enter task to add: ");
                    String taskToAdd = scanner.nextLine();
                    addTask(taskToAdd);
                    break;
                case 2:
                    System.out.print("Enter the index of the task to delete: ");
                    int indexToDelete = scanner.nextInt();
                    deleteTask(indexToDelete - 1); 
                    break;
                case 3:
                    displayTasks();
                    break;
                case 4:
                    System.out.print("Enter the index of the task to mark as complete: ");
                    int indexToComplete = scanner.nextInt();
                    markAsComplete(indexToComplete - 1); 
                    break;
                case 0:
                    System.out.println("Exiting the application. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        
        scanner.close();
    }
}
