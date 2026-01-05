package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;


public interface StudentRepo extends JpaRepository<Student, Integer> {
	
	// int Integer
	//float Float
	// double  Double
	//String  String

}
