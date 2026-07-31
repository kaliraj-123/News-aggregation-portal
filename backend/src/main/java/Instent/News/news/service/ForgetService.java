package Instent.News.news.service;

import Instent.News.news.repository.RegiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForgetService {

    @Autowired
    private RegiRepository repository;

    public boolean checkEmail(String email) {
        return repository.findByEmail(email).isPresent();
    }
}