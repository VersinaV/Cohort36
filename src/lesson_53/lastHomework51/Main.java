package lesson_53.lastHomework51;

import static java.lang.Character.toUpperCase;

import java.util.Arrays;

public class Main {

  public static boolean isPangram(String sentence) {
    sentence = sentence.toLowerCase();
    for (char letter = 'a'; letter <= 'z'; letter++) {
      if (sentence.indexOf(letter) == -1) {
        return false;
      }
    }
    return true;
  }

  static byte[] parseIp(String ip) throws Exception {
    // Разделение строки на подстроки по точке
    String[] octets = ip.split("\\.");

    // Проверка количества полученных октетов
    if (octets.length != 4) {
      throw new Exception("Invalid IPv4 address format");
    }
    byte[] ipAddressBytes = new byte[4]; // sosdaem parsing
    try {
      // Преобразование строк в значения типа byte
      for (int i = 0; i < 4; i++) {
        int octetValue = Integer.parseInt(octets[i]);
        if (octetValue < 0 || octetValue > 255) {
          throw new Exception("Invalid octet value: " + octetValue);
        }
        ipAddressBytes[i] = (byte) octetValue;
      }
    } catch (NumberFormatException e) {
      throw new Exception("Invalid numeric format in IP address");
    }

    return ipAddressBytes;
  }

  public static String encrypt(String text) {
    StringBuilder sb = new StringBuilder();
    for (char ch : text.toCharArray()) {
      sb.append((char) (ch + 3));
    }
    return sb.toString();
  }

  public static String decrypt(String data) {
    StringBuilder sb = new StringBuilder();
    for (char ch : data.toCharArray()) {
      sb.append((char) (ch - 3));
    }
    return sb.toString();
  }

  int countOccurencies(String text, char letter) {
    // Проверка на null или пустую строку
    if (text == null || text.isEmpty()) {
      return 0;
    }

    // Инициализация переменной count для хранения количества вхождений
    int count = 0;

    // Итерация по каждому символу в строке
    for (char c : text.toCharArray()) {
      // Проверка, равен ли текущий символ указанному символу
      if (c == letter) {
        // Увеличение счетчика, если обнаружено совпадение
        count++;
      }
    }

    // Возврат окончательного значения счетчика
    return count;
  }

  public static String reverse(String s) {
    return new StringBuilder(s).reverse().toString();
  }

  public static boolean isEmail(String email) {
    return email.matches("[a-zA-Z0-9._]+(\\+[a-zA-Z0-9._]+)+?@[a-zA-Z0-9._]+");
  }

  public static boolean isPalindrome(String s) {
    s = s.toLowerCase().replace("[^a-z]", "");
    return reverse(s).equals(s);
  }

  public static String reverseWord(String s)  {
    StringBuilder sb = new StringBuilder();
    String[] words = s.split(" ");
    for (int i = words.length - 1; i >= 0; i--) {
      sb.append(words[i]).append(" ");
    }
    return sb.toString().trim();
  }

  public static String toCamelCase(String text) {
    String[] splitText = text.toLowerCase().split(" ");
    StringBuilder sb = new StringBuilder(splitText[0]);
    for (int i = 1; i < splitText.length ; i++) {
      sb.append(toUpperCase(splitText[i].charAt(0))).append(splitText[i].substring(1));
    }
    return sb.toString();
  }



  public static void main(String[] args) throws Exception {
    System.out.println(Arrays.toString(parseIp("168.192.1.12")));
    System.out.println(isEmail("versina.vasile@gmail.com"));

  }
}
