package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.TestTimeEntity;

public interface TestRepository extends 
JpaRepository<TestTimeEntity,Integer>, CrudRepository<TestTimeEntity,Integer>{

}
