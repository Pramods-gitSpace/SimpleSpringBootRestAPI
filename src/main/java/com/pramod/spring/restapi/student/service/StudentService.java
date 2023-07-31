package com.pramod.spring.restapi.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pramod.spring.restapi.student.entity.Student;
import com.pramod.spring.restapi.student.repo.StudentRepo;

@Service
public class StudentService
{
	@Autowired
	StudentRepo studentRepo;
	@Transactional
	public List<Student> findAllStudents(){
		return (List<Student>)studentRepo.findAll();
	}
	public Optional<Student> findStudentById(Integer id) {
		return studentRepo.findById(id);
	}
	@Transactional
	public Student saveStudent(Student student) {
		return studentRepo.save(student);
	}
	@Transactional
	public void deleteStudentById(Integer id) {
		studentRepo.deleteById(id);
	}
	
}
