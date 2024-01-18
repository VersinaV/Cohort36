package lesson_49.task02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double res = 0;
    try {
      double a = scanner.nextDouble();
      double b = scanner.nextDouble();
      res = a / b;
    } catch (InputMismatchException ex) {
      System.out.println("You inputted wrong symbols!");

    }
    System.out.println("Result " + res);
  }
}
