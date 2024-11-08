package com.jordigarcia.mensajeria.persistence.repository;

import com.jordigarcia.mensajeria.persistence.entities.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository <Message, Integer>{
}
