package com.example.demo.web;

import java.util.List;
import java.util.Optional;
import java.util.TimeZone;
import com.example.demo.repository.*;
import com.example.demo.service.TestTimeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.TestTimeEntity;

@Controller
@RequestMapping("/TestTimeEntity")
public class TestController {
	
	@Autowired
	private TestRepository timeRepository;
	
	@Autowired
	private TestTimeService testTimeService;
	
	@RequestMapping("/view")
	@ResponseBody
	public List<TestTimeEntity> list() {
		testTimeService.create();
		
		List<TestTimeEntity> testTimeEntityList = timeRepository.findAll();
		System.out.println(testTimeEntityList);
		
		return testTimeEntityList;
	}

}
