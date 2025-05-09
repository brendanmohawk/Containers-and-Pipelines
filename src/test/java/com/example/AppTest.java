package com.example;

// Importing JUnit 5's @Test annotation to mark test methods
// and assertEquals for checking expected results in tests.
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppTest {
  
  // Uses JUnit 5 to verify the behavior of the getMessage method.
  @Test
  public void testMessage() {
    App app = new App();
    assertEquals("Hello World!", app.getMessage());
    System.out.println("Test Passed: The message is correct!");
  }
  
  @Test
  public void testMessageNotNull() {
    App app = new App();
    assertNotNull(app.getMessage(), "Message should not be null");
    System.out.println("Test Passed: The message is not null!");
    }
}
