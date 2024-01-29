package Consultation.Practice_07.Text;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ExampleTest {

  // org.junit.jupiter:junit-jupiter:5.9.1

  @Test
  void stringBuilderAppendsProperly() {
    StringBuilder sb = new StringBuilder();
    sb.append("Hello");
    assertEquals("Hello", sb.toString());
  }

  @Test
  void stringBuilderNonEmptyAfterAppend() {
    StringBuilder sb = new StringBuilder();
    assertTrue(sb.toString().isEmpty());
    sb.append("a");
    assertFalse(sb.toString().isEmpty());
  }
}
