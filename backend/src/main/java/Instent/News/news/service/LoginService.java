package Instent.News.news.service;

import Instent.News.news.entity.Regi;
import Instent.News.news.repository.RegiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

    @Autowired
    private RegiRepository repository;

    public boolean login(String email, String password) {
        return repository.findByEmailAndPassword(email, password).isPresent();
    }
}