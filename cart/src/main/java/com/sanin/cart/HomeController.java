package com.sanin.cart;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Value("${value}")
    private String name;

    @RequestMapping("/")
    public String index(){
        System.out.println(name);
        return "index.html ";  
    }

     


    
    
}
