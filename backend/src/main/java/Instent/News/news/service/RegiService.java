package Instent.News.news.service;

import Instent.News.news.entity.Regi;
import Instent.News.news.repository.RegiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegiService {

    @Autowired
    private RegiRepository regiRepository;

    public Regi register(Regi regi) {
        return regiRepository.save(regi);
    }
}