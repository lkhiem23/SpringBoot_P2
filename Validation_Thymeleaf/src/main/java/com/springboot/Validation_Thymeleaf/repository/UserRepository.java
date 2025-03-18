package com.springboot.Validation_Thymeleaf.repository;

import com.springboot.Validation_Thymeleaf.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, Long> {

    // Kiểm tra userName trùng:

    boolean existsByUsername(String username);
}
