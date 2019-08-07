package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @RequestMapping("/get")
  public String getWelcomeMsg()
  {
    return "Welcome!";
  }
  
}
