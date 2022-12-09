package Final;

import java.util.ArrayList;
import java.util.Scanner;
public class Task {
    @Override
    public String toString() {
        return  taskTitle +
                ", Due " + dueDate +
                ", " + taskStatus +
                ", " + taskDesc;
    }

    private String taskTitle;
    private String dueDate;
    private String taskStatus;
    private String taskDesc;

    public String getTaskTitle() {
        return taskTitle;
    }

    public void setTaskTitle(String taskTitle) {
        this.taskTitle = taskTitle;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    static ArrayList<Task> taskList = new ArrayList<>();

    public static void addTask() {
        Task newTask = new Task();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Task Title: ");
        newTask.setTaskTitle(input.nextLine());
        System.out.print("Enter Task Date: ");
        newTask.setDueDate(input.nextLine());
        System.out.print("Enter Task Status: ");
        newTask.setTaskStatus(input.nextLine());
        System.out.print("Enter Task Description: ");
        newTask.setTaskDesc(input.nextLine());
        taskList.add(newTask);
    }
    public static void finishTask() {
        Scanner input = new Scanner (System.in);
        System.out.println("Which task would you like to Finish?: ");
        int taskNum = input.nextInt();
        for (int i = 0; i < taskList.size(); i++) {
            System.out.println(taskList.get(i));
        }
        taskList.get(taskNum-1).setTaskStatus("Finished");
    }
    public static void deleteTask(){
            Scanner input = new Scanner (System.in);
            System.out.println("Which task would you like to Delete?: ");
            int taskNum = input.nextInt();
        for (int j = 0; j < taskList.size(); j++) {
            System.out.println(taskList.get(j));
        }
            taskList.remove(taskNum-1);
        }
    public static void editTask(){
        Scanner input = new Scanner(System.in);
        System.out.println("Which Task would you like to Edit?: ");
        int taskNum = input.nextInt();
        for (int k = 0; k < taskList.size(); k++) {
            System.out.println(taskList.get(k));
        }
        input = new Scanner(System.in);
        System.out.print("Enter Task Title: ");
        taskList.get(taskNum-1).setTaskTitle(input.nextLine());
        System.out.print("Enter Task Date: ");
        taskList.get(taskNum-1).setDueDate(input.nextLine());
        System.out.print("Enter Task Status: ");
        taskList.get(taskNum-1).setTaskStatus(input.nextLine());
        System.out.print("Enter Task Description: ");
        taskList.get(taskNum-1).setTaskDesc(input.nextLine());
    }
    public static void showTasks(){
        for (int l = 0; l < taskList.size(); l++) {
            System.out.println(taskList.get(l));
        }
    }
}


