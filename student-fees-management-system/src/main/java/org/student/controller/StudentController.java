package org.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.student.entity.Student;
import org.student.service.StudentService;

@RestController  
 
public class StudentController {    
	 @Autowired  
	  private StudentService  studentService;  
	  
	  @PostMapping ("/student") 
	   public Student student (@RequestBody Student student ) {
		     return this.studentService.student(student) ;   
		      
 } 
	  
	   @GetMapping("/student/getAll")
	 public List <Student> getAllStudent()  {
		return studentService.getAllStudent() ;
	} 
	    
	    @GetMapping("/student/{Id}")  
	     public  Student getStudent(@PathVariable String Id ) 
	       { 
	    	 return this.studentService.getStudent(Long.parseLong(Id)) ; 
	    	 
	    }
	   
	     @PutMapping  ("/updatestudent") 
	      public Student  updateStudent(@RequestBody Student student   ) { 
	    	  return this.studentService.updateStudent(student) ; 
	     }   
	     
	      @DeleteMapping ("/deletestudent/{StudentId}") 
	       public ResponseEntity<HttpStatus> deleteStudent (@PathVariable  String StudentId ) { 
	    	  try { this.studentService.deleteStudent(Long.parseLong(StudentId)) ;  
	    	   return new ResponseEntity<>(HttpStatus.OK) ;  } 
	    	   catch (Exception e ) {
	    		    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR) ; 
	    	   }
	    	   
	    	   
	      }
	  
	 

}
