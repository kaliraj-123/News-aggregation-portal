package Instent.News.news.controller;

import Instent.News.news.entity.Regi;
import Instent.News.news.service.EmailService;
import Instent.News.news.service.ForgetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @Autowired
    private ForgetService forgetService;

    @PostMapping("/forget")
    public String forget(@RequestBody Regi user) {

        if (!forgetService.checkEmail(user.getEmail())) {
            return "Account not found";
        }
        String otp = String.valueOf((int)(Math.random() * 900000) + 100000);
        emailService.sendOtp(user.getEmail(), otp);
        return "OTPSent"+" "+otp;
    }
}