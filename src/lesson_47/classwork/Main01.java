package lesson_47.classwork;

public class Main01 {
  /*
  Sosdati po odnoi peremenoi kajdowo obertocinowo klassa ii wiwesti ix w konsoli
   */

  public static void main(String[] args) {

    Byte byteNumber = 4;
    Short shortNumber = 546;
    Integer intNumber = 65223165;
    Long longNumber = 1000000000000L;
    Float floatNumber = 4.5f;
    Double doubleNumber = 456.123123;
    Character charLetter = 'a';
    Boolean boolFlag = false;

    System.out.println("Byte: " + byteNumber);
    System.out.println("Short: " + shortNumber);
    System.out.println("Integer: " + intNumber);
    System.out.println("Long: " + longNumber);
    System.out.println("Float: " + floatNumber);
    System.out.println("Double: " + doubleNumber);
    System.out.println("Character: " + charLetter);
    System.out.println("Boolean: " + boolFlag);

    int primitive = 5;
    Integer wrapper = Integer.valueOf(primitive);
    int otherPrimitive = wrapper.intValue();
    System.out.println("After unboxing: " + otherPrimitive);

  }

}
