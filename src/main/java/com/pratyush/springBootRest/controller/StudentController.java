package com.pratyush.springBootRest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratyush.springBootRest.model.Student;
import com.pratyush.springBootRest.service.StudentService;

@RequestMapping("/api")
@RestController
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@PostMapping("/students")
	public Student createRecord(@RequestBody Student student) {
		return service.createStudent(student);
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return service.getAllStudentRecords();
	}
	
	@GetMapping("/students/{id}")
	public Student searchStudent(@PathVariable long id) {
		return service.serachStudentById(id);
	}
	
	@PutMapping("/students")
	public Student updateRecord(@RequestBody Student student) {
		return service.updateStudentRecord(student);
	}
	
	@DeleteMapping("/students/{id}")
	public String deleteStudent(@PathVariable long id) {
		service.deleteStudentRecordById(id);
		return id + " Studnt Record is deleted";
	}
	

}
