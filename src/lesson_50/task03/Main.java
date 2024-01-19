package lesson_50.task03;

import java.util.Scanner;

public class Main {
/*
 Perewesti peredanii text w nijnii register
 Wse polisie bukwi doljni stani malenkami a - bolisimi
 */
  public static String changeCase(String text) {
    StringBuilder sb = new StringBuilder();
    for (Character ch : text.toCharArray()) {
      if (Character.isLowerCase(ch)) {
        sb.append(Character.toUpperCase(ch));
      } else {
        sb.append(Character.toLowerCase(ch));
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter text: ");
    String text = scanner.nextLine();
    System.out.println(changeCase(text));
  }

}
