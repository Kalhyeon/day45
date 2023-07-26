package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

// 서블릿은 doGet 과 doPost 두 개의 메서드를 가진다
// => 여러 작업을 하면 서블릿이 여러개 필요하다.
// 스프링 컨트롤러는 여러개의 메서드를 가질 수 있다.

// 서블릿은 extends HttpServlet 형식의 클래스 => 상속으로 표준을 가져온다.
// 스프링은 상속 대신 어노테이션을 사용한다.
// 스프링 클래스는 어노테이션을 제외하면 지극히 평범한 자바 클래스이다
// (POJO).

// 사용자의 입력을 받아 작업을 제어하고 결과를 출력하는 클래스
@Controller
public class SampleController {
  @GetMapping("/index")
  public String index() {
//  ModelAndView : 결과를 출력할 뷰
//                 + 결과 (Model)를 저장하는 스프링 클래스
    return "index";
  }
  
//  컨트롤러는 매개변수가 정해져 있지 않다
//  => 프로그래머가 필요한 매개변수로 지정한다.
  @PostMapping("/test1")
  public String test1(@RequestParam String name) {
//    @RequestParam : 사용자의 요청으로부터
//                    name 이라는 값을 꺼내어 String 에 담음
//                    => 생략하면 자동으로 들어간다.
    System.out.println(name);
    return null;
  }
  
  @PostMapping("/test2")
  public String test2(@RequestParam Integer age) {
    System.out.println(age);
    return null;
  }
}
