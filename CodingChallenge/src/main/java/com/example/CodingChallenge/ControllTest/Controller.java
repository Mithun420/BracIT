package com.example.CodingChallenge.ControllTest;

import com.example.CodingChallenge.entity.UserEntity;
import com.example.CodingChallenge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")

public class Controller
{
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserEntity> getAllUser()
    {
        List<UserEntity> users= userService.getAllUser();
        System.out.println("User:"+users);
        return users;
    }

    @GetMapping
    public UserEntity getUserbyId(@PathVariable Long userId)
    {
        UserEntity user= userService.getUserById(userId);
        return user;
    }

    @PostMapping
    public String saveUser(@RequestBody UserEntity user)
    {
        userService.saveUser(user,user);
        return "update successful";
    }

    @PutMapping("/{userId}")
    public String updateUser(@RequestBody UserEntity user, @PathVariable Long userId)
    {
        userService.updateUser(user,userId);
        return "update successful";
    }


}
