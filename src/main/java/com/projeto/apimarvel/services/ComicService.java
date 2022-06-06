package com.projeto.apimarvel.services;

import com.projeto.apimarvel.repositories.ComicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComicService {

    @Autowired
    private ComicRepository comicRepository;
}
