package com.example.CodingChallenge.service.implementation;

import com.example.CodingChallenge.entity.UserEntity;
import com.example.CodingChallenge.repository.UserRepository;
import com.example.CodingChallenge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImp implements UserService
{


    private UserRepository userRepository;
    @Override
    public List<UserEntity> getAllUser() {
        return null;
    }

    @Override
    public UserEntity getUserById(Long userId) {
        return null;
    }

    @Override
    public void updateUser(UserEntity user, Long userid) {

    }

    @Override
    public void deleteUserId(Long userId) {

    }

    @Override
    public void saveUser(UserEntity user, UserEntity user1) {
        
    }
}
