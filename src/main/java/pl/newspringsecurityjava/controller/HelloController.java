package pl.newspringsecurityjava.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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

    @GetMapping("/admin")
    public String adminPermit() {
        return "admin";
    }

    @GetMapping("/403")
    public String accesssDenied(Model model) {

        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            UserDetails userDetail = (UserDetails) auth.getPrincipal();
            System.out.println(userDetail);

            model.addAttribute("user", userDetail.getUsername());

        }

        return "403";

    }

    @GetMapping("/myLogin")
    public String myLogin(Model model) {

        return "myLogin";
    }

}
