package com.projeto.apimarvel.services;

import com.projeto.apimarvel.entities.User;
import com.projeto.apimarvel.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;
    public List<User> findAll(){ //buscar todos os usuários da lista
        return repository.findAll();
    }
}
