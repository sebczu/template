package com.sebczu.template.user.service;

import com.sebczu.template.user.domain.User;
import org.springframework.stereotype.Service;

@Service
public class GetUserService {

  public User get() {
    User hello = new User();
    hello.setId(1L);
    hello.setUsername("sebczu");
    return hello;
  }
}
