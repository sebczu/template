package com.sebczu.template.hello.service;

import com.sebczu.template.hello.domain.Hello;
import org.springframework.stereotype.Service;

@Service
public class GetHelloService {

  public Hello get() {
    Hello hello = new Hello();
    hello.setId(1L);
    hello.setName("sebczu");
    return hello;
  }
}
