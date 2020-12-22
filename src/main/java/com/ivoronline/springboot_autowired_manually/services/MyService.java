package com.ivoronline.springboot_autowired_manually.services;

import org.springframework.stereotype.Service;

@Service
public class MyService {

  public String sayHello() {
    return "Hello";
  }

}
