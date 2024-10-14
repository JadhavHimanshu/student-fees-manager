package org.student.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table 
  @Entity
public class Student {    
	 @Id 
	  @GeneratedValue
	   private long  id ; 
	    private String  firstname ;   
	     private String  lastname ;  
	      private String collegename ; 
	      private String  fees  ;
		public Student(long id, String firstname, String lastname, String collegename, String fees) {
			super();
			this.id = id;
			this.firstname = firstname;
			this.lastname = lastname;
			this.collegename = collegename;
			this.fees = fees;
		}
		public Student() {
			super();
		   
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getCollegename() {
			return collegename;
		}
		public void setCollegename(String collegename) {
			this.collegename = collegename;
		}
		public String getFees() {
			return fees;
		}
		public void setFees(String fees) {
			this.fees = fees;
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", collegename="
					+ collegename + ", fees=" + fees + "]";
		}  
		 
	        
	     
	 

}
