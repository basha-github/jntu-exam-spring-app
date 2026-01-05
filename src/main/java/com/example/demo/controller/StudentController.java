package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	
	/**
	 * Post---create
	 * Get----read
	 * Put----update
	 * Delete---delete
	 * 
	 * CRUD----
	 * 
	 * 
	 * 
	 * 
	 */
	
	//StudentService stuService = new StudentService();
	
	@Autowired
	StudentService stuService;
	
	
	@PostMapping("/jntu/exam/stu/add")
	public String addNewStudent(@RequestBody Student stuData) {
		
		
		
		stuService.saveNewStudent(stuData);
		
		return "successfully added new Student";
	}

}
