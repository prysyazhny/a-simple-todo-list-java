package org.example;

public class App {
  public static void main(String[] args) {

    TodoList list = new TodoList();
 
    list.add("Buy milk");
    list.add("Buy eggs");
    list.add("Prepare a lesson for CSC 122");
    list.add("Sow beet seeds");
 
    list.complete("Buy eggs");
 
    // Pretty prints a list of each of the four tasks above
    list.listAll();
 
    // Pretty prints the task "Buy eggs"
    list.listComplete();
 
    // Pretty prints the tasks "Buy milk",
    // "Prepare a lesson for CSC 122", and "Sow beet seeds"
    list.listIncomplete();
 
    // Clears the to-do list
    list.clear();
 
    // Pretty prints a message saying that the list is empty
    list.listAll();

  }
}
