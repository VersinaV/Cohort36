package lesson_51.exemple04;

public class Main {
  /*
  ["AS", "3S", "9S", "KS", "4S"] ==> true
  ["AD", "4S", "7H", "KS", "10S"] ==> false
   2, 3, 4, 5, 6, 7, 8, 9, 10, J, Q, K, A
   H D C S
   */
  public static boolean CheckIfFlush(String[] cards) {
    String suit = String.valueOf(cards[0].charAt(cards[0].length() - 1));
    for (String s : cards) {
      if (!s.endsWith(suit)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String[] flushCards = {"AS", "3S", "9S", "KS", "4S"};
    String[] nonFlushCards = {"AD", "4S", "7H", "KS", "10S"};

    System.out.println(CheckIfFlush(flushCards));
    System.out.println(CheckIfFlush(nonFlushCards));
  }

}
