package pl.newspringsecurityjava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.newspringsecurityjava.entity.Role;
import pl.newspringsecurityjava.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/addUser")
    @ResponseBody
    public String addNewUser() {
        User user = new User();
        user.setUsername("jan");
        user.setPassword("asd");
        user.setEmail("asd@asd.pl");
//        Role role = new Role();
//        role.setUsername(user.getUsername());
//        role.setRole("USER");
        return "user jan added";
    }

    @GetMapping("/addAdmin")
    @ResponseBody
    public String addNewAdmin() {
        User user = new User();
        user.setUsername("admin");
        user.setPassword("asd");
        user.setEmail("admin@asd.pl");
        user.setRole("ADMIN");
//        Role role = new Role();
//        role.setUsername(user.getUsername());
//        role.setRole("ADMIN");
        return "user admin added";
    }
}
