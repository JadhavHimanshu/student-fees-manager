package org.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.dao.StudentDao;
import org.student.entity.Student;
@Service
public class StudentServiceImpl  implements StudentService {
 @Autowired  
  private StudentDao studentdao ;  
   
  public StudentServiceImpl() {
	   
  }
	@Override
	public Student student(Student student) {
		studentdao.save(student)  ;
		return student;
	}

	@Override
	public List<Student> getAllStudent() {

		return  studentdao.findAll(); 
	}
	@Override
	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Student getStudent(long long1) {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public  void deleteStudent(long parseLong) {
	   Student entity = studentdao.getOne(parseLong); 
		 studentdao.delete(entity);

	}
	@Override
	public Student deleteStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
