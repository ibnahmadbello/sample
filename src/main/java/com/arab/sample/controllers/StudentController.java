package com.arab.sample.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arab.sample.entities.Student;
import com.arab.sample.repo.StudentRepo;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepo studentRepo;
	
	@GetMapping("/records")
	public List<Student> getAllRecord() {
		return studentRepo.findAll();
	}
	
	@PostMapping("/addRecord")
	public Student addRecord(@RequestBody Student newStudent) {
		Student student = studentRepo.save(newStudent);
		return student;
	}

}
