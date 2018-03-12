package pl.newspringsecurityjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {

    @GetMapping("/hello")
    @ResponseBody
    public String helloGet() {
        return "helloget";
    }

    @PostMapping("/hello")
    @ResponseBody
    public String helloPost() {
        return "hellopost";
    }

    @GetMapping({"/", "/index"})
    public String index (Model model, HttpServletRequest request) {
        model.addAttribute("user", "uzytk");
        return "index";
    }
}
