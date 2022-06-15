package com.example.thymeleafdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/welcome")
public class PersonController {

    @GetMapping
    String getPeople(Model model) {
        model.addAttribute("welcomestatement", "welcome to my webpage!");
        return "welcome";
    }
}
