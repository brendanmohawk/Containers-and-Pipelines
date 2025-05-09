package com.example;

// Importing JUnit 5's @Test annotation to mark test methods
// and assertEquals for checking expected results in tests.
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
  
  // Uses JUnit 5 to verify the behavior of the getMessage method.
  @Test
  public void testMessage() {
    App app = new App();
    assertEquals("Hello World!", app.getMessage());
  }
}
