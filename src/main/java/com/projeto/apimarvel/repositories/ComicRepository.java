package com.projeto.apimarvel.repositories;

import com.projeto.apimarvel.entities.Comic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComicRepository extends JpaRepository<Comic, Long> {
}
