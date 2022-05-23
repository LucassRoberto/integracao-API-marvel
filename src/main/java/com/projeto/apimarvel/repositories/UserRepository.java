package com.projeto.apimarvel.repositories;

import com.projeto.apimarvel.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
