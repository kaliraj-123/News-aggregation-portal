package Instent.News.news.controller;

import Instent.News.news.entity.Regi;
import Instent.News.news.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class PasswordController {

    @Autowired
    private PasswordService passwordService;

    @PostMapping("/getPassword")
    public String getPassword(@RequestBody Regi user) {

        return passwordService.getPassword(user.getEmail());

    }
}