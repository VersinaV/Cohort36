package lesson_50.task01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main  {
  /*
  Razrabotati programu kotoroi mojno budet westi ceslo bez osibok
  pri neprawilinom wiwede
   */
  public static int readNumber(String message) throws Exception {
    Scanner scanner = new Scanner(System.in);
    try {
      int n = scanner.nextInt();
      return n;
    } catch (InputMismatchException exception) {
      throw new Exception(exception);
    }
  }

  public static void main(String[] args)  {
    System.out.println("Welcome t addition calculator");
    int a = 0;
    int b = 0;
    try {
      a = readNumber("Enter first number");
      b = readNumber("Enter second number");
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

    System.out.println("Result " + (a + b));
  }

}
