package com.example.CodingChallenge.repository;

import com.example.CodingChallenge.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity,Long>
{

}
