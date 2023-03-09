package com.mysite.community;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  @GetMapping("/community")
  @ResponseBody
  public String index() {
    return "index";
  }
}
