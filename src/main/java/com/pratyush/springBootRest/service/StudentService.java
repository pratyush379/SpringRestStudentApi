package com.pratyush.springBootRest.service;

import java.util.List;

import com.pratyush.springBootRest.model.Student;

public interface StudentService {
	
Student createStudent(Student student);	
List<Student> getAllStudentRecords();
Student updateStudentRecord(Student student);
Student serachStudentById(long id);
void deleteStudentRecordById(long id);


}
