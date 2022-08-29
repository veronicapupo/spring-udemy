package com.veronicapupo.springudemy.resource;

import com.veronicapupo.springudemy.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity< List<User>> findAll(){
        User maria = new User("1","Maria Lucia","maria@gmail.com");
        User renato = new User("1","Renato Silva","resilva@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(maria, renato));
        return ResponseEntity.ok().body(list);
    }
}
