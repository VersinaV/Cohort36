package lesson_49.task01;

public class Main {

  public static void main(String[] args) {
    MyLinkedList<String> list = new MyLinkedList<>();
    list.add("Hello");
    list.add("Hey");
    list.add("Greetings");
    list.add("Hi");

    list.remove(2);

    for (String s : list) { // foreach
      System.out.println(s + " world");
    }
  }
}
