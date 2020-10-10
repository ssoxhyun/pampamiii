package com.example.pharmwebspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {

    @GetMapping("/index")
    public String indexpage(){
        return "index";
    }

    @GetMapping("/register")
    public String resgisterpage(){
        return "register";
    }

    @GetMapping("/login")
    public String loginpage(){
        return "login";
    }


}
