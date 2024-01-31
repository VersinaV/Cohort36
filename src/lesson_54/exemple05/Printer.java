package lesson_54.exemple05;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
 private Queue<String> printQueue;

  public Printer() {
    printQueue = new LinkedList<>();
  }

  public void enqueue(String text) { // enqueue - dobawiti w oceridi
     printQueue.offer(text);
  }

  public void print() {
    while (!printQueue.isEmpty()) {
      String text = printQueue.poll();
      System.out.println("Printer prints: " + text);
    }
  }
}
