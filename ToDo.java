package Final;

import java.util.Scanner;

import static Final.Task.*;

public class ToDo {
    public static void main(String[] args) {
        boolean mainLoop = true;
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("Select an option: ");
            System.out.println("1: Add Task | 2. Mark as Finished | 3. Delete Task | 4. Edit Task | 5. Display tasks | 6. Exit");
            int menuSelect;
            menuSelect = input.nextInt();

            switch (menuSelect) {
                case 1 -> addTask();
                case 2 -> finishTask();
                case 3 -> deleteTask();
                case 4 -> editTask();
                case 5 -> showTasks();
                case 6 -> System.exit(0);
                default -> System.out.println("Enter a valid option");
            }

        }
    }
}
