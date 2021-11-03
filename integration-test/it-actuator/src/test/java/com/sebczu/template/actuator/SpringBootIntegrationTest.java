package com.sebczu.template.actuator;

import static java.util.TimeZone.getTimeZone;

import java.util.TimeZone;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sebczu.template")
public class SpringBootIntegrationTest {

  static {
    TimeZone.setDefault(getTimeZone("UTC"));
  }

}
