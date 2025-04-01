package org.student.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.student.entity.Student;

public  interface StudentDao  extends  JpaRepository< Student , Long  >{
   
	
	 

}
