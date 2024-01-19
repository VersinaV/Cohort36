package Consultation.Practice_06.exemple02;

import Consultation.Practice_06.exemple01.Pakage02.ConsoleReader;

public class Main {

  public static void main(String[] args) {
    int a = ConsoleReader.readInt();
    try {
      if (a < 0) {
        throw new Exception("Goodbye world!");
      }
      if (a > 0) {
        throw new IllegalAccessException("Hello");
      }
    } catch (IllegalAccessException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      throw new RuntimeException(e);
    } finally {
      System.out.println("We finished our program");
    }
    System.out.println("Program ended");
  }
}
