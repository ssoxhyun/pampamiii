package com.example.pharmwebspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/web")
public class HomeController {
    @GetMapping("/test")
    public String home(Model model){
        model.addAttribute("msg", "HelloWorld");
        return "index";
    }

}

