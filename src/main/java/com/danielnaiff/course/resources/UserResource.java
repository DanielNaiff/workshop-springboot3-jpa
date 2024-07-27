package com.danielnaiff.course.resources;

import com.danielnaiff.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping //significa que responde a requisicao do tipo get do http
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria", "maria@gmail.com", "9999999", "12345");

        // retorna resposta com sucesso(ok) e retorna o corpo da resposta(u)
        return ResponseEntity.ok().body(u);
    }
}
