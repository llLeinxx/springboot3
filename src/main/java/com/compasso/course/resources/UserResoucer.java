package com.compasso.course.resources;

import com.compasso.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResoucer {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L,"Marria", "marria@gmail.com", "9999999", "12345");
        return ResponseEntity.ok().body(u);

    }
}
