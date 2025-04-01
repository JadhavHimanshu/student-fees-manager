package org.student.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.student.entity.Student;

public  interface  StudentService { 
	 public List<Student> getStudent() ;

	public Student student(Student student);

	public List<Student> getAllStudent();

	public Student getStudent(long long1);

	public Student updateStudent(Student student);

	public Student deleteStudent(Student student);

	void deleteStudent(long parseLong); 
	  

}
