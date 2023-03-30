package com.example.taco;

import com.example.taco.entities.Ingredient;
import com.example.taco.entities.Users;
import com.example.taco.repos.IngredientRepository;
import com.example.taco.repos.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class TacoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoApplication.class, args);
    }
    
    @Bean
    public CommandLineRunner dataLoader(IngredientRepository repository){
        return args -> {
            repository.save(new Ingredient("FLTO", "Flour Tortilla", Ingredient.Type.WRAP));
            repository.save(new Ingredient("COTO", "Corn Tortilla", Ingredient.Type.WRAP));
            repository.save(new Ingredient("GRBF", "Ground Beef", Ingredient.Type.PROTEIN));
            repository.save(new Ingredient("CARN", "Carnitas", Ingredient.Type.PROTEIN));
            repository.save(new Ingredient("TMTO", "Diced Tomatoes", Ingredient.Type.VEGGIES));
            repository.save(new Ingredient("LETC", "Lettuce", Ingredient.Type.VEGGIES));
            repository.save(new Ingredient("CHED", "Cheddar", Ingredient.Type.CHEESE));
            repository.save(new Ingredient("JACK", "Monterrey Jack", Ingredient.Type.CHEESE));
            repository.save(new Ingredient("SLSA", "Salsa", Ingredient.Type.SAUCE));
            repository.save(new Ingredient("SRCR", "Sour Cream", Ingredient.Type.SAUCE));
        };
    }





}
