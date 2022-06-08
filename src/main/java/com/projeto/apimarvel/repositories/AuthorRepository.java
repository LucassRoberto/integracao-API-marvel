package com.projeto.apimarvel.repositories;

import com.projeto.apimarvel.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
