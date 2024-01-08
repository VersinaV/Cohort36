package lesson_46.classwork;

import java.util.Random;
import java.util.Scanner;

public class Main05 {
  /*
  Sgenerirowati masiw is sluciainih cisel w diapozone ot 0 do 50(10 elementow)
  Sprosit u polizowatelia ceslo:
  Wiwesti index elementa, znacenie kotorowo sowpadaet c wodidom cisel
  Peremesati elimenti sluciainim obrozow. w peremeseonim masiwe naiti element eseo raz
   */

  public static int[] generateRandomArray(int length, int min, int max) {
    int[] array = new int[length];
    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = min + random.nextInt(max - min + 1);
    }
    return array;
  }

  public static void print(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i]  + ", ");
    }
  }

  public static int find(int[] array, int element) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == element) {
        return i;
      }
    }
    return -1;
  }

  public static void shuffler(int[] array) {
    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      int index = random.nextInt(array.length);

      int temp = array[index];
      array[index] = array[i];
      array[i] = temp;
    }
  }

  public static void main(String[] args) {
    int[] array = generateRandomArray(10,1,50);
    print(array);
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int index = find(array, n);
    if (index != -1) {
      System.out.println("Index wwiedenowo cesla: " + index);
    }
    shuffler(array);
    print(array);
    index = find(array, n);
    if (index != -1) {
      System.out.println("Index wwiedenowo cesla: " + index);
    }
  }
}
