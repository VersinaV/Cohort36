package lesson_46.classwork;

import java.util.Random;
import java.util.Scanner;

public class Main04 {
  /*
  Sgenerirowati masiw is sluciainih cisel w diapozone ot 0 do 50(10 elementow)
  Sprosit u polizowatelia ceslo:
  Wiwesti index elementa, znacenie kotorowo sowpadaet c wodidom cisel
   */

  public static void main(String[] args) {
    int[] array = new int[10];
    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = 1 + random.nextInt(50 - 1);
    }
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]  + ", ");
    }
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int index = -1; //
    for (int i = 0; i < array.length; i++) {
      if (array[i] == n) {
        index = i;
        break;
      }
    }
    if (index != -1) {
      System.out.println("Index wwiedenowo cesla: " + index);
    }
  }
}
