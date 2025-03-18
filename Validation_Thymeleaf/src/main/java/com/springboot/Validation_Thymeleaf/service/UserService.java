package com.springboot.Validation_Thymeleaf.service;

import com.springboot.Validation_Thymeleaf.entity.User;
import com.springboot.Validation_Thymeleaf.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    @Transactional
    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }

    @Transactional
    public User saveUser(User user){
        if (user.getId()==null){
            return userRepository.save(user);
        }
        User user1 = userRepository.findById(user.getId()).get();
        user1.setId(user.getId());
        user1.setFullName(user.getFullName());
        user1.setEmail(user.getEmail());
        user1.setPassword(user.getPassword());
        user1.setPhone(user.getPhone());
        user1.setAddress(user.getAddress());
        user1.setIsActive(user.getIsActive());
        return userRepository.save(user1);
    }

    @Transactional
    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }
}
