package lesson_55;

public class Main05 {

  public static void main(String[] args) {
    Runnable method = () -> System.out.println("Hello world!");

    method.run();
  }

}
