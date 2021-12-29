package com.sebczu.template.hello.controller;

import com.sebczu.template.hello.api.ExternalHelloAPI;
import com.sebczu.template.hello.domain.Hello;
import com.sebczu.template.hello.service.GetHelloService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ExternalHelloController implements ExternalHelloAPI {

  private final GetHelloService getService;

  @Override
  public Hello get() {
    log.info("endpoint invoked: get");
    return getService.get();
  }
}
