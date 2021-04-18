package com.tek.studentManager.service;

import java.util.List;

import com.tek.studentManager.model.Student;

public interface IStudentService {
	public Student addStudent(Student student) ;
	public List<Student> findAllStudents() ;
	public Student updateStudent(Student student) ;
	public Student findStudentById(Long id) ;
	public void deleteStudent(Long id) ;
	
}
