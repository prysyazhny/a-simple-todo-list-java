package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class AppTest {

  @Test
  void testAddFunction() {
    TodoList list = new TodoList();
    list.add("Task 1");
    list.add("Task 2");
    list.add("Task 3");

    ArrayList<String> expectedTasks = new ArrayList<>();
    expectedTasks.add("Task 1");
    expectedTasks.add("Task 2");
    expectedTasks.add("Task 3");

    assertEquals(expectedTasks, list.getTasks());
  }

  @Test
  void testCompleteFunction() {
    TodoList list = new TodoList();
    list.add("Task 1");
    list.add("Task 2");
    list.complete("Task 1");

    ArrayList<String> expectedTasks = new ArrayList<>();
    expectedTasks.add("Task 2");

    ArrayList<String> expectedCompletedTasks = new ArrayList<>();
    expectedCompletedTasks.add("Task 1");

    assertEquals(expectedTasks, list.getTasks());
    assertEquals(expectedCompletedTasks, list.getCompletedTasks());
  }

  @Test
  void testClearFunction() {
    TodoList list = new TodoList();
    list.add("Task 1");
    list.add("Task 2");
    list.clear();

    assertTrue(list.getTasks().isEmpty());
    assertTrue(list.getCompletedTasks().isEmpty());
  }

}
