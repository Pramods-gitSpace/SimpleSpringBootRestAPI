package com.pramod.spring.restapi.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pramod.spring.restapi.student.entity.Student;
import com.pramod.spring.restapi.student.service.StudentService;
@CrossOrigin
@RestController
@RequestMapping("/api1")
public class StudentController {
	@Autowired
	StudentService service;

	@GetMapping("/students")
	public List<Student> getStudents() {
		return service.findAllStudents();
	}
	@GetMapping("/students/{id}")
    public Optional<Student> getStudent(@PathVariable("id") Integer id) {
    	return service.findStudentById(id);
    }
	@PostMapping("/students")
	public Student save(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	@PutMapping("/students")
	public Student update(@RequestBody Student student) {
		return service.saveStudent(student);
	}
	@DeleteMapping("/students/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
    	 service.deleteStudentById(id);
    }
}
