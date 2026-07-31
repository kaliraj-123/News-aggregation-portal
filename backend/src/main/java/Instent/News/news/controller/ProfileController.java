package Instent.News.news.controller;

import Instent.News.news.entity.Regi;
import Instent.News.news.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ProfileController {

    @Autowired
    private ProfileService service;

    @PostMapping("/profile")
    public Regi profile(@RequestBody Regi user) {

        return service.getProfile(user.getEmail());

    }
}