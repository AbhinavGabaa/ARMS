package com.example.demo.Controller;

import org.springframework.ui.Model;
import com.example.demo.Entities.User;
import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public String showRegistrationForm() {
        return "register";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam String username,
                               @RequestParam String password,
                               Model model) {
        try {
            userService.registerUser(username, password, "ROLE_USER");
            model.addAttribute("success", "User registered successfully!");
        } catch (Exception e) {
            model.addAttribute("error", "Username already exists.");
        }
        return "register";
    }
    @PostMapping("/api/login")
    public String login(@RequestBody User user) {
        // System.out.println(user);

        return userService.verify(user);
    }
}
