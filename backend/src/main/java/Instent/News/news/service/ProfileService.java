package Instent.News.news.service;

import Instent.News.news.entity.Regi;
import Instent.News.news.repository.RegiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {

    @Autowired
    private RegiRepository repository;

    public Regi getProfile(String email) {

        return repository.findByEmail(email).orElse(null);

    }
}