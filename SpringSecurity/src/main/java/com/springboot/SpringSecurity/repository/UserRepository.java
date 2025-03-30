package com.springboot.SpringSecurity.repository;

import com.springboot.SpringSecurity.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
