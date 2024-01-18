package lesson_49.task03;

import java.util.Scanner;

public class Main {

  public static int readNaturalNumber() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter natural number");
    int number = scanner.nextInt();
    if (number <= 0) {
      // throw - brosati
      throw new RuntimeException("This is not natural number!");
    }

    return number;
  }

  public static void main(String[] args) {
    int number;
    try {
      number = readNaturalNumber();
    } catch (RuntimeException ex) {
      System.out.println(ex.getMessage());
      return;
    }

    System.out.println("Thank you!");
  }
}
