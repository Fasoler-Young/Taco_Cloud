package com.example.taco.repos;

import com.example.taco.entities.Users;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Users, Long> {

    Users findByUsername(String username);

}
