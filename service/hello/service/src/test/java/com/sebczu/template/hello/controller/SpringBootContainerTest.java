package com.sebczu.template.hello.controller;

import static java.util.TimeZone.getTimeZone;

import java.util.TimeZone;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sebczu.template")
public class SpringBootContainerTest {

  static {
    TimeZone.setDefault(getTimeZone("UTC"));
  }

}
