package com.pramod.spring.restapi.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.pramod.spring.restapi.student.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
