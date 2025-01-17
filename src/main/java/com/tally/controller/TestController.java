package com.tally.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tally.model.Test;
import com.tally.service.TestService;
@RestController
public class TestController {
	
	@Autowired	
	private TestService testService;

	@GetMapping("/check")
	public String check() {
		return "index";
	}
	
	@PostMapping("/save")
	public Test save(@RequestBody Test test) {
	return	testService.insert(test);
	}
	
}
