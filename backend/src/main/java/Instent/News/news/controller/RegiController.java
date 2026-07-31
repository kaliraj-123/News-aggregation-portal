package Instent.News.news.controller;

import Instent.News.news.entity.Regi;
import Instent.News.news.service.RegiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class RegiController {

    @Autowired
    private RegiService regiService;

    @PostMapping("/register")
    public Regi register(@RequestBody Regi regi) {
        return regiService.register(regi);
    }
}