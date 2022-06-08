package com.projeto.apimarvel.services;

import com.projeto.apimarvel.entities.Author;
import com.projeto.apimarvel.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> findAll(){
        return authorRepository.findAll();
    }

    public Author findById(Long id){
        Optional<Author> obj = authorRepository.findById(id);
        return obj.get();
    }
}
