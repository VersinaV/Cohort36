package lesson_55;

public class Main04 {

  public static void sayHello() {
    System.out.println("Hello worlds");
  }

  public static void main(String[] args) {
    Runnable method = Main04::sayHello;

    method.run();

  }
}
