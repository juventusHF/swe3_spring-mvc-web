package ch.juventus.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String helloWithParam(Model model, @RequestParam String name) {
        model.addAttribute("message", "Hello World!");
        model.addAttribute("name", name);
        return "hello";
    }
}