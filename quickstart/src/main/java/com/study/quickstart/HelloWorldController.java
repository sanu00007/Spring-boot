package com.study.quickstart;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    @GetMapping(path="/")
    public String hello(){
        return "helloWorld.html";
    }
}



