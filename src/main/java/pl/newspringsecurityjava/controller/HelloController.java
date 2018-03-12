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
    public String helloGet(Model model) {
        model.addAttribute("tekst", "asdasdsdas");
        return "helloget";
    }

    @PostMapping("/hello")
    @ResponseBody
    public String helloPost() {
        return "hellopost";
    }

    @GetMapping({"/", "/index"})
    public String index (Model model, HttpServletRequest request) {
        model.addAttribute("user", request.getRemoteUser());
        return "index";
    }
}
