package lesson_55;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main03 {

  public static void main(String[] args) {
    Map<String, Double> products = new HashMap<>();
    products.put("Яблоко", 2.0);
    products.put("Картошка", 1.5);
    products.put("Огурец", 2.5);
    products.put("Помидор", 3.0);
    products.put("Лук", 1.0);
    products.put("Виноград", 3.5);

    Scanner scanner = new Scanner(System.in);
    String userChoice = scanner.nextLine();

    if (products.containsKey(userChoice)) {
      System.out.println("Price: " + products.get(userChoice));
    } else {
      System.out.println("Товара " + userChoice + " нет в магазине");

      System.out.println("Towari kotorie esti: ");
      for (String key : products.keySet()) {
        System.out.println(key + ", zena: " + products.get(key));
      }
    }
  }
}
