package com.veronicapupo.springudemy.services;


import com.veronicapupo.springudemy.domain.User;
import com.veronicapupo.springudemy.dto.UserDto;
import com.veronicapupo.springudemy.repository.UserRepository;
import com.veronicapupo.springudemy.services.exception.ObjectNotFoundException;
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

    public User findById(String id) {
        User user = repo.findOne(id);
        if (user == null) {
            throw new ObjectNotFoundException("Objeto não encontrado");
        }
        return user;
    }

    public User insert(User obj){
        return repo.insert(obj);
    }

    public User fromDto(UserDto objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}
