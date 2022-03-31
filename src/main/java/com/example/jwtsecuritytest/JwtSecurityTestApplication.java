package com.example.jwtsecuritytest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication

public class JwtSecurityTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtSecurityTestApplication.class, args);
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode("1234567");

        System.out.println(encodedPassword);
    }

}
