package com.pratyush.springBootRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pratyush.springBootRest.model.Student;

public interface StudentRepository extends JpaRepository<Student,Long> {
//this repository will deal with student table
}
