package com.projeto.apimarvel.config;

import com.projeto.apimarvel.entities.Author;
import com.projeto.apimarvel.entities.Comic;
import com.projeto.apimarvel.entities.User;
import com.projeto.apimarvel.repositories.AuthorRepository;
import com.projeto.apimarvel.repositories.ComicRepository;
import com.projeto.apimarvel.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ComicRepository comicRepository;

    @Autowired
    private AuthorRepository authorRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Silva", "maria@gmail.com","50458071021", Date.from(Instant.parse("1994-02-24T19:53:07Z")));
        User u2 = new User(null, "Ana Bacana", "ana@gmail.com","37212926000", Date.from(Instant.parse("1990-06-20T19:53:07Z")));

        userRepository.saveAll(Arrays.asList(u1, u2));

        Comic com1 = new Comic(null,"Homem-aranha", 29.90, "aaaaaa", "Herói");
        Comic com2 = new Comic(null,"Super homem", 29.90, "bbbb", "Herói");
        Comic com3 = new Comic(null,"Hulk", 19.90, "ccccc", "Herói");

        comicRepository.saveAll(Arrays.asList(com1, com2, com3));

        Author a1 = new Author(null, "Stan Lee", "xxxxx");
        Author a2 = new Author(null, "Joe Shuster", "yyyyy");

        authorRepository.saveAll(Arrays.asList(a1,a2));

        com1.getAuthors().add(a1);
        com2.getAuthors().add(a2);
        com3.getAuthors().add(a1);

        comicRepository.saveAll(Arrays.asList(com1, com2, com3));

        u1.getComicList().add(com1);
        u1.getComicList().add(com3);
        u2.getComicList().add(com2);
        u2.getComicList().add(com1);

        userRepository.saveAll(Arrays.asList(u1, u1, u2, u2));
    }
}
