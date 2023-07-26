package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SampleController2 {
  @GetMapping("/write")
  public String write() {
    return "write";
  }
  
  @PostMapping("/write")
  public String write(@RequestParam String nickname,
                      @RequestParam String title,
                      @RequestParam String content) {
    System.out.println(nickname);
    System.out.println(title);
    System.out.println(content);
    return null;
  }
}
