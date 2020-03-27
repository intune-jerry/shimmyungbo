package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.ProductEntity;
import com.example.demo.domain.UserEntity;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.UserRepository;

@Service
@Transactional
public class JpaTestService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public List<UserEntity> getUserList() {
		return userRepository.findAll();
		
	}
	
	public List<ProductEntity> getProductList(){
		return productRepository.findAll();
	}
	
	public ProductEntity updateProduct(ProductEntity productEntity) {
		return productEntity;
		
	}

}
