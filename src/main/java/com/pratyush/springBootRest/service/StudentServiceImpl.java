package com.pratyush.springBootRest.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pratyush.springBootRest.exception.RecordNotFoundException;
import com.pratyush.springBootRest.model.Student;
import com.pratyush.springBootRest.repository.StudentRepository;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	
	@Autowired
	StudentRepository repository;//to communicate with repository layer
	
	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}

	@Override
	public List<Student> getAllStudentRecords() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Student updateStudentRecord(Student student) {
		// TODO Auto-generated method stub
		Optional<Student> studentFromDB = repository.findById(student.getStudentId());
		
		if(!studentFromDB.isPresent()) {
			throw new RecordNotFoundException(student.getStudentId() +"is not present in the database");
			
		}
		return repository.save(student);
		
	}

	@Override
	public Student serachStudentById(long id) {
		// TODO Auto-generated method stub
Optional<Student> studentFromDB = repository.findById(id);
		
		if(!studentFromDB.isPresent()) {
			throw new RecordNotFoundException(id +"is not present in the database");
			
		}
		return studentFromDB.get();
		
	}

	@Override
	public void deleteStudentRecordById(long id) {
		// TODO Auto-generated method stub
Optional<Student> studentFromDB = repository.findById(id);
		
		if(!studentFromDB.isPresent()) {
			throw new RecordNotFoundException(id +"is not present in the database");
			
		}
		else {
		 repository.delete(studentFromDB.get());}
		
		
	}

}
