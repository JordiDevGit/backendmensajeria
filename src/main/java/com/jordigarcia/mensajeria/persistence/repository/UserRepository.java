package com.jordigarcia.mensajeria.persistence.repository;

import com.jordigarcia.mensajeria.persistence.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Integer>{
    User findByUserName(String username);
}
