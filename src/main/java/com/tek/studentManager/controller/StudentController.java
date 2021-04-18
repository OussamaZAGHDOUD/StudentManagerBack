package com.tek.studentManager.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tek.studentManager.model.Student;
import com.tek.studentManager.service.IStudentService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {

	private final IStudentService iStudentService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> students = iStudentService.findAllStudents();
		return new ResponseEntity<>(students,HttpStatus.OK);
	}
		
	@GetMapping("/find/{id}")
	public ResponseEntity<Student> getStudentById(@PathVariable ("id") Long id){
		Student student = iStudentService.findStudentById(id);
		return new ResponseEntity<>(student,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student){
		Student newStudent=iStudentService.addStudent(student);
		return new ResponseEntity<>(newStudent,HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Student> updateStudent(@RequestBody Student student){
		Student updatedStudent=iStudentService.updateStudent(student);
		return new ResponseEntity<>(updatedStudent,HttpStatus.CREATED);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> updateStudent(@PathVariable Long id){
		iStudentService.deleteStudent(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
