package com.springfirstproject.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.springfirstproject.course.entities.User;
import com.springfirstproject.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
    
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Clare", "clare@gmail.com", "9999999", "123456");
        User u2 = new User(null, "Bob", "bob@gmail.com", "98999999", "321654");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }

}
