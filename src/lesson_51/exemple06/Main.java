package lesson_51.exemple06;

public class Main {
  public static String splitInParts(String s, int partLength) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      sb.append(s.charAt(i));
      if (i % partLength == 0) {
        sb.append(" ");
      }
    }
    return  sb.toString();
  }

  public static void main(String[] args) {
    String input = "abcdefghij";
    int partLength = 2;
    String result = splitInParts(input, partLength);
    System.out.println(result);
  }

}
