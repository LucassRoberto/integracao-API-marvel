package com.projeto.apimarvel.controller;

import com.projeto.apimarvel.entities.Comic;
import com.projeto.apimarvel.services.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/comics")
public class ComicController {

    @Autowired
    private ComicService comicService;

    @GetMapping
    public ResponseEntity<List<Comic>> findAll(){
        List<Comic> list = comicService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<Comic> findById(@PathVariable Long id){
    Comic obj = comicService.findById(id);
    return ResponseEntity.ok().body(obj);
    }
}
