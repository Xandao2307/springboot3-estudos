package com.aulaSpring.cursoJava.resources;

import com.aulaSpring.cursoJava.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    public ResponseEntity<User> findAll(){
        User u = new User(1L,"maria","maria@gmail.com","99999999","12345");
        return ResponseEntity.ok().body(u);
    }
}
