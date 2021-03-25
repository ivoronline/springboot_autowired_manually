package com.ivoronline.springboot_autowired_manually.controllers;

import com.ivoronline.springboot_autowired_manually.services.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  //@Autowired
  MyService myService = new MyService();

  @ResponseBody
  @RequestMapping("/hello")
  public String sayHello() {
    String result = myService.sayHello();
    return result;
  }

}


