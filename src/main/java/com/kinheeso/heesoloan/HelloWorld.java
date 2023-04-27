package com.kinheeso.heesoloan;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("name", "Hello World!");
        return "index";
    }
}
