package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>, CrudRepository<ProductEntity, Integer>{



}
