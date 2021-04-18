package com.tek.studentManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tek.studentManager.model.Student;

public interface StudentRepository  extends JpaRepository<Student, Long>{
	void deleteStudentById(Long id );
}
