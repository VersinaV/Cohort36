package lesson_51.exemple01;

import java.util.Arrays;

public class Main {
  /*
  Razrabotati metod, kotorii prinimaet stroku, w kotorii napisan masiw
  poscitati summu etowo masiwa
   */

  public static int calculateSum(String arr) {
    String[] numers = arr.split(" ");
    int sum = 0;
    for (String s : numers) {
      sum += Integer.parseInt(s);
    }
    return sum;
  }

  public static void main(String[] args) {
    System.out.println(calculateSum("1 2 3 4"));
    System.out.println(calculateSum("4 68 122 35 81 32"));

  }

}
