package com.uyarisal.hibernate.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "instructor")

public class Instructor {
	//annonte class as an entitiy and map to db 
		//define the fields 
		//annonate fields 
	// set up oen to one mapping a real class. 
		//create constructors 
		//generate getter and setters 
		//generate tostring method.
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id ; 
	@Column(name = "last_name")
	private String lastName ; 
	@Column(name = "first_name")
	private String firstName ; 
	@Column(name = "email")
	private String email ;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "instructor_detail_id")
	private InstructorDetail instructorDetail; 
	
	public Instructor () {
		
	}

	public Instructor(String lastName, String firstName, String email) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public InstructorDetail getInstructorDetail() {
		return instructorDetail;
	}

	public void setInstructorDetail(InstructorDetail instructorDetail) {
		this.instructorDetail = instructorDetail;
	}

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", lastName=" + lastName + ", firstName=" + firstName + ", email=" + email
				+ ", instructorDetail=" + instructorDetail + "]";
	}
	//tostring metodu program içerisinde yazılan entitiylerin string olarak yazılmasını ve kullanılmasını sağlayan metoddur. 
}
