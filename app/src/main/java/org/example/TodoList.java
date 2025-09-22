package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> tasks = new ArrayList<>();
    private ArrayList<String> completedTasks = new ArrayList<>();

    public ArrayList<String> getTasks() {
        return new ArrayList<>(tasks);
    }
    public ArrayList<String> getCompletedTasks() {
        return new ArrayList<>(completedTasks);
    }

    public void add(String task) {
        tasks.add(task);
    }

    public void complete(String task) {
        tasks.remove(task);
        completedTasks.add(task);
    }

    public void listAll() {
        if (tasks.isEmpty() && completedTasks.isEmpty()) {
            System.out.println("\nThe to-do list is empty.");
        } else {
            System.out.println("\nIncomplete tasks:");
            for (String task : tasks) {
                System.out.println("- " + task);
            }
            System.out.println("Completed tasks:");
            for (String task : completedTasks) {
                System.out.println("- " + task);
            }
        }
    }

    public void listComplete() {
        if (completedTasks.isEmpty()) {
            System.out.println("\nNo completed tasks.");
        } else {
            System.out.println("\nCompleted tasks:");
            for (String task : completedTasks) {
                System.out.println("- " + task);
            }
        }
    }

    public void listIncomplete() {
        if (tasks.isEmpty()) {
            System.out.println("\nNo incomplete tasks.");
        } else {
            System.out.println("\nIncomplete tasks:");
            for (String task : tasks) {
                System.out.println("- " + task);
            }
        }
    }

    public void clear() {
        tasks.clear();
        completedTasks.clear();
    }

}
