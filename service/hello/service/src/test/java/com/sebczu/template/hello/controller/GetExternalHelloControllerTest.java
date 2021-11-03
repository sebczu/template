package com.sebczu.template.hello.controller;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

public class GetExternalHelloControllerTest extends ExternalHelloControllerTest {

  private static final String URL = "/external/hello";

  @Test
  void whenGetHelloShouldReturnHelloResponse() throws Exception {
    mvcClient.perform(get(URL))
        .andDo(print())
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.id").value(is(1)))
        .andExpect(jsonPath("$.name").value(is("sebczu")));
  }

}
