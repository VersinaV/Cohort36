package Consultation.Practice_07;

import java.util.Scanner;

public class Main {
  /*
  Napisati programu, kotoroia skladuet dwa cesla, no tolika esli poprositi "pojalusta"

   */

  public static void main(String[] args) {
    System.out.println("Hello, enter twu numbers to add please");
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    String s = scanner.nextLine();
    if (!s.contains("please")) {
      throw new RuntimeException("You didnt ask politely!");
    }
    System.out.println("Sure, the sum is: " + (a + b));
  }
}
