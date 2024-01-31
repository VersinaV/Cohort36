package lesson_55.exemple01;

public class Main01 {

  public static void main(String[] args) {
    String s = "Hello";
    System.out.println(s.hashCode() % 16);
    System.out.println(s.hashCode());
  }
}
