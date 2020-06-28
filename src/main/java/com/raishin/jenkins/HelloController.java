package com.raishin.jenkins;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String getHello() {
        System.out.println("change!");
        return "hello";
    }
}
