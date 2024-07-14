package com.example.CodingChallenge.service;

import com.example.CodingChallenge.entity.UserEntity;

import java.util.List;

public interface UserService
{
    List<UserEntity> getAllUser();

    UserEntity getUserById(Long userId);

    void updateUser(UserEntity user, Long userid);

    void deleteUserId(Long userId);

    void saveUser(UserEntity user, UserEntity user1);
}
