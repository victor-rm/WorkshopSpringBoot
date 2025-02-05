package com.victru.lilcrud.resources;

import com.victru.lilcrud.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Victor", "<EMAIL>", "123456789", "123456789");
        return ResponseEntity.ok().body(u); // Retorna com sucesso no HTTP
    }
}
