package com.sebczu.template.user.api;

import com.sebczu.template.user.domain.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Validated
@RequestMapping("/external/user")
public interface ExternalUserAPI {

  @GetMapping
  User get();

}
