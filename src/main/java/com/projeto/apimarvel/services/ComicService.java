package com.projeto.apimarvel.services;

import com.projeto.apimarvel.entities.Comic;
import com.projeto.apimarvel.repositories.ComicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ComicService {

    @Autowired
    private ComicRepository comicRepository;

    public List<Comic> findAll(){
        return comicRepository.findAll();
    }

    public Comic findById(Long id){
        Optional<Comic> obj = comicRepository.findById(id);
        return obj.get();
    }
}
