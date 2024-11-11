package com.jordigarcia.mensajeria.controller;

import com.jordigarcia.mensajeria.persistence.entities.Message;
import com.jordigarcia.mensajeria.persistence.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/messages")
public class MessageController {
    @Autowired
    private MessageRepository messageRepository;

    @GetMapping
    public List<Message> selectMessages (){
        return messageRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Message> createMessage(@RequestBody Message message) {
        // Guardamos el mensaje en la base de datos
        Message savedMessage = messageRepository.save(message);

        // Devolvemos la respuesta con el mensaje creado y un código 201 (Creado)
        return new ResponseEntity<>(savedMessage, HttpStatus.CREATED);
    }
}
