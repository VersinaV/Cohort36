package lesson_54.exemple03;

import java.util.List;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    Stack<String> greetings = new Stack<>();

    greetings.push("Hello");
    greetings.push("Hi");
    greetings.addAll(List.of("Good morning", "Good afternoon", "Good evening"));


    while (!greetings.isEmpty())  {
      String elem = greetings.pop();
      System.out.println(elem + " world!");
    }

  }

}
