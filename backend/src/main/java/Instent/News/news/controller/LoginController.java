package Instent.News.news.controller;

import Instent.News.news.entity.Regi;
import Instent.News.news.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class LoginController {

    @Autowired
    private LoginService service;
    @PostMapping("/login")
    public String login(@RequestBody Regi users) {

        if(service.login(users.getEmail(), users.getPassword())) {
            return "Login Successful";
        }

        return "Invalid Email or Password";
    }
}