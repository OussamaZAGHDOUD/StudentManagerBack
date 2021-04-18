package com.tek.studentManager.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.tek.studentManager.exceptions.StudentNotFoundException;
import com.tek.studentManager.model.Student;
import com.tek.studentManager.repository.StudentRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentService implements IStudentService{

	private final StudentRepository studentRepository;

	public Student addStudent(Student student) {
		student.setStudentCode(UUID.randomUUID().toString());
		return studentRepository.save(student);
	}

	public List<Student> findAllStudents() {
		return studentRepository.findAll();
	}

	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}

	public Student findStudentById(Long id) {
		return studentRepository.findById(id)
				.orElseThrow(() -> new StudentNotFoundException("Student by this id : " + id + "  is not found !"));
	}

	public void deleteStudent(Long id) {
		studentRepository.deleteStudentById(id);
	}

}
