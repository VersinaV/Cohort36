package lesson_50.task03;

import java.util.Scanner;

public class Main01 {
/*
Pri scitanie texta s kartinki, programa drugowa progromista dopustila osibku
Wse bukwi S ona scitaet kak 5, bukwa 0 kak 0 i bukwa I kak 1
Napisati metod kotorii isprawil eto osibku
 */
  public  static String correct(String text) {
    return text.replace('5', 'S').replace('0', 'O').replace('1', 'I').replace(',', '`');
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    System.out.println(correct(text));
  }

}
