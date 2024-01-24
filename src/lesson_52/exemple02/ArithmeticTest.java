package lesson_52.exemple02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class ArithmeticTest {

  @Test
  void basicAdditionWork() {
    double actual = ArithmeticHelper.add(3, 8);
    double expected = 11;

    assertEquals(expected, actual);
  }

  @Test
  void zeroAdditionDoesntChangeNumber() {
    double number = 5;
    number = ArithmeticHelper.add(number, 0);
    double expected = 5;
    assertEquals(expected, number);
  }

  @Test
  void basicDifferenceWork() {
    double actual = ArithmeticHelper.diff(3, 8);
    double expected = -5;

    assertEquals(expected, actual);
  }

  @Test
  void subtractionFromZeroFlipsSing() {
    double actual = ArithmeticHelper.diff(0, 5);
    double expected = -5;

    assertEquals(expected, actual);
  }

  @Test
  void basicMultiplicationWork() {
    double actual = ArithmeticHelper.mult(4, 8);
    double expected = 32;

    assertEquals(expected, actual);
  }

  @Test
  void negativeMultiplicationWork() {
    double a = -2;
    double b = -8;

    double actual = ArithmeticHelper.mult(a, b);
    assertTrue(actual > 0);

    a = 5;
    actual = ArithmeticHelper.mult(a, b);
    assertTrue(actual < 0);
  }

  @Test
  void basicDivisionWork() {
    double actual = ArithmeticHelper.div(4, 8);
    double expected = 0.5;

    assertEquals(expected, actual);
  }

  @Test
  void divisionZeroThrowsArithmeticException() {
    try {
      ArithmeticHelper.div(1, 0);
      fail("Division by 0 didnt throw an exception");
    } catch (ArithmeticException e) {

    }
  }

  @Test
  void replacePrincipleWork() {
    double a = 4;
    double b = 6;

    boolean actual = ArithmeticHelper.add(a, b) == ArithmeticHelper.add(b, a);
    assertTrue(actual);
  }

  @Test
  void combinePrincipleWork() {
    double a = 5;
    double b = 6;
    double c = 7;

    boolean actual = ArithmeticHelper.add(ArithmeticHelper.add(a, b), c)
        == ArithmeticHelper.add(a, ArithmeticHelper.add(b, c));
    assertTrue(actual);
  }

  @Test
  void numberMinusSumChangesTwoSigns() {
    double a = 5;
    double b = 6;
    double c = 7;

    boolean actual = ArithmeticHelper.diff(a, ArithmeticHelper.add(b, c))
        == ArithmeticHelper.diff(ArithmeticHelper.diff(a, b), c);

    assertTrue(actual);
  }

  @Test
  void anyNumberMultipleZeroEqualsZero() {
    for (double i = 2.0; i <= 2.0; i += 0.5) {
      assertEquals(0.0, ArithmeticHelper.mult(i, 0.0));
    }
    assertEquals(0.0, ArithmeticHelper.mult(Double.MAX_VALUE - 1.0, 0.0));

  }
}


    