package Consultation.Practice_06.exemple01.Pakage02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleReader {

  private static Scanner scanner;

  static {
    scanner = new Scanner(System.in);
  }

  public static int readInt() {
    try {
      return scanner.nextInt();
    } catch (InputMismatchException e) {
      return 0;
    }
  }
}
