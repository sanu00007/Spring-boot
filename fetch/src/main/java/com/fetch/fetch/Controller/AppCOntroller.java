package com.fetch.fetch.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fetch.fetch.Model.Students;

@RestController
@CrossOrigin
public class AppCOntroller {

    @GetMapping("/")
    public Students hello(){
        return new Students("sanin mohammed N", 21, "Male");
    }
    @PostMapping("/")
    public Students poster(@RequestBody Students obj){  
        return obj;
    }
    
}
