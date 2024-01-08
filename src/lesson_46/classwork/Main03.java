package lesson_46.classwork;

import java.util.Scanner;

public class Main03 {
   /*
  Napisti programu, kotoroe budet sitati gipotenuzu triugonika po dwum katetom
  Kateti doljni wiwodita is konsole
   */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Wedite dlini kateta");
    double a = scanner.nextInt();
    double b = scanner.nextInt();

    if (a <= 0 || b <= 0) {
      System.out.println("Katet ne mojet mense 0!");
    } else {
    double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    System.out.println("Dlina gipotenuzi: " + c);
    }
  }
}
