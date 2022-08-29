package com.veronicapupo.springudemy.config;

import com.veronicapupo.springudemy.domain.User;
import com.veronicapupo.springudemy.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
@Configuration
public class Instantiation implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User ricardo = new User(null,"Veronica","email@gmail.com");
        User veronica = new User(null,"Ricardo","rickfai@gmail.com");

        userRepository.saveAll(Arrays.asList(veronica,ricardo));
    }
}
