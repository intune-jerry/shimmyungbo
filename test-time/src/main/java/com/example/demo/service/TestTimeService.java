package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.TestTimeEntity;
import com.example.demo.repository.TestRepository;

@Service
@Transactional
public class TestTimeService {
	
	@Autowired
	private TestRepository testRepository;
	
	public void create() {
		
		TestTimeEntity testTimeEntity = new TestTimeEntity();
		testTimeEntity.setName("±¸¶ó1");
		testTimeEntity.setUpdateTime(LocalDateTime.now());
		TestTimeEntity newTestTimeEntity = testRepository.save(testTimeEntity);
		System.out.println(newTestTimeEntity);
	}
	
	
	public List<TestTimeEntity> getTestTimeEntity(){
		return testRepository.findAll();
	}
	 
	
	public void removeTime(TestTimeEntity testTimeEntity) {
		//testEntityRepository.delete(testEntity);
	}

}
