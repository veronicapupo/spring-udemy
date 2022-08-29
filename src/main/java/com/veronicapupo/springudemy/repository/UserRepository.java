package com.veronicapupo.springudemy.repository;

import com.veronicapupo.springudemy.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
