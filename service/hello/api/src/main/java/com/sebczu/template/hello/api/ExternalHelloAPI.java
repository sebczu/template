package com.sebczu.template.hello.api;

import com.sebczu.template.hello.domain.Hello;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Validated
@RequestMapping("/external/hello")
public interface ExternalHelloAPI {

  @GetMapping
  Hello get();

}
