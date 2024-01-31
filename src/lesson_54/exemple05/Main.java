package lesson_54.exemple05;

public class Main {
  // razrabotati klass printar, kotoromu mojno dobawiti tekst dlea peceati w oceridi,
  //a potom pecetati wse srazu

  public static void main(String[] args) {
    Printer printer = new Printer();
    printer.enqueue("Hello");
    printer.enqueue("This is my printer");
    printer.enqueue("I am paper");

    printer.print();

  }

}
