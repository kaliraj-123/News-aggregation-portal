package Instent.News.news.service;

import Instent.News.news.entity.Regi;
import Instent.News.news.repository.RegiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class PasswordService {

    @Autowired
    private RegiRepository repository;

    public String getPassword(String email) {

        Optional<Regi> user = repository.findByEmail(email);

        if (user.isPresent()) {
            return user.get().getPassword();
        }

        return "Account not found";
    }
}