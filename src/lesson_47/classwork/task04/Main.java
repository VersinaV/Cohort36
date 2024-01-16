package lesson_47.classwork.task04;

public class Main {

  public static void main(String[] args) {
    MyArray<String> strings = new MyArray<>();
    strings.add("Hello");
    strings.add("Hey");
    strings.add("Greetings");
    strings.add("Hi");
    System.out.println(strings);

    MyArray<Double> number = new MyArray<>();
    number.add(456.0);
    number.add(123.6);
    number.add(0, 0.0);
    System.out.println(number);
  }
}