package Instent.News.news.repository;

import Instent.News.news.entity.Regi;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface RegiRepository extends JpaRepository<Regi, Long> {

    Optional<Regi> findByEmailAndPassword(String email, String password);
    Optional<Regi> findByEmail(String email);

}