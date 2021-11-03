package com.sebczu.template.actuator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = SpringBootIntegrationTest.class)
public class ActuatorTest {

  @Test
  public void test() {
    System.out.println("TEST INTEGRATION");
  }

}
