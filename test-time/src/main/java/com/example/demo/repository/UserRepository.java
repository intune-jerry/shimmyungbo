package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>,
												CrudRepository<UserEntity, Integer>{
	

}
