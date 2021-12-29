package com.sebczu.template.user.controller;

import com.sebczu.template.user.api.ExternalUserAPI;
import com.sebczu.template.user.domain.User;
import com.sebczu.template.user.service.GetUserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ExternalUserController implements ExternalUserAPI {

  private final GetUserService getService;

  @Override
  public User get() {
    log.info("endpoint invoked: get");
    return getService.get();
  }
}
