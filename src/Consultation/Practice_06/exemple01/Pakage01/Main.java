package Consultation.Practice_06.exemple01.Pakage01;

import Consultation.Practice_06.exemple01.Pakage02.ConsoleReader;

public class Main {

  public static void main(String[] args) {
    System.out.println("Enter two values");
    int a = ConsoleReader.readInt();
    int b = ConsoleReader.readInt();
    System.out.println(a + " + " + b + " = " + (a+b));
  }
}
