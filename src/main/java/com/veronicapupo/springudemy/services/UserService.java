package com.veronicapupo.springudemy.services;


import com.veronicapupo.springudemy.domain.User;
import com.veronicapupo.springudemy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;
    public List<User> findAll(){
        return repo.findAll();

    }
}
