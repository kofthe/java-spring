package com.uyarisal.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.uyarisal.hibernate.demo.entity.Student;

public class DeleteStudentDemo {
			public static void main(String[] args) {
				// create session factory 
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory()	; 
		
		//create session 
			
		Session session = factory.getCurrentSession() ; 
		
		
		try {
			int studentId = 1 ; 
			
			//new session and transaction 
			session = factory.getCurrentSession() ; 
			session.beginTransaction() ; 
		
			//retrieve student based on the id: primary key 
System.out.println("/n getting student with id: " + studentId) ;
			
			Student myStudent = session.get(Student.class, studentId) ; 
			System.out.println("Deleting Student" + myStudent.getFirstName());
			session.delete(myStudent) ;
			
			session.getTransaction().commit() ; 
			
			System.out.println("Done!");
		}finally {
			
		}
}
			}
