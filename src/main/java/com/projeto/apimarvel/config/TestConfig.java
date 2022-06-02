package com.projeto.apimarvel.config;

import com.projeto.apimarvel.entities.User;
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


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Silva", "maria@gmail.com","50458071021", Date.from(Instant.parse("1994-02-24T19:53:07Z")));
        User u2 = new User(null, "Ana Bacana", "ana@gmail.com","37212926000", Date.from(Instant.parse("1990-06-20T19:53:07Z")));

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
