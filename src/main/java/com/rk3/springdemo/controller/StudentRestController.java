package com.rk3.springdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rk3.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	private List<Student> students;
	
	@PostConstruct
	public void loadStudents() {
		students = new ArrayList<Student>();
		students.add(new Student("Charles", "Barkley"));
		students.add(new Student("Leslie", "Knope"));
		students.add(new Student("Ron", "Swanson"));
	}

	@GetMapping("/students")
	public List<Student> getStudents() {
		return students;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		Student student = students.get(studentId);
		return student;				
	}
}
