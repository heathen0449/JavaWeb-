package com.winter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String toIndex(){
        return "add";
    }

    @GetMapping("/fuck")
    public String toIndex1(){
        return "show";
    }
}
