package com.noobhackers.demofirsttrymaven.runner;

import com.noobhackers.demofirsttrymaven.entity.User;
import com.noobhackers.demofirsttrymaven.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandRunner implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {

        User user1 = User.builder()
                .firstName("Ivan")
                .lastName("Ivanov")
                .email("alabalanica@here.com")
                .password("HakunaMatata@1")
                .build();
        User savedUser = userRepository.save(user1);
        System.out.println(savedUser);
    }
}
