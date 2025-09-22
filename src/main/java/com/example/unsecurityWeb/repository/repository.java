package com.example.unsecurityWeb.repository;

import com.example.unsecurityWeb.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface repository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
