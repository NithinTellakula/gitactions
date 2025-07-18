package com.example.gitactions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "Hello, this is my GitHub Actions");
        return "index";
    }
}
