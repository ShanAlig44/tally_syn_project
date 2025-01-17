package com.tally.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tally.exception.TestException;
import com.tally.model.Test;
import com.tally.repository.TestRepository;
import com.tally.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestRepository testRepository;
	
	@Override
	public Test insert(Test test) {
		
		if(test==null || test.getName() == null) {
			throw new TestException("Invalid Data");
		}
		
		return testRepository.save(test);
		
	}

}
