package com.example.myapp.data.repositories;

import com.example.myapp.data.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
