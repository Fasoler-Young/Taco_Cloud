package com.example.taco.controllers;

import com.example.taco.entities.Users;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

@Data
public class RegistrationForm {

    private String username;
    private String password;
    private String city;

    public Users toUser(PasswordEncoder encoder){
        return new Users(username, encoder.encode(password), city);
    }
}
