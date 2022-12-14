package com.uyarisal.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.uyarisal.hibernate.demo.entity.Student;

public class ReadStudentDemo {
			public static void main(String[] args) {
				// create session factory 
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory()	; 
		
		//create session 
			
		Session session = factory.getCurrentSession() ; 
		
		
		try {
			// use the session object to save java java object
			System.out.println("Creating a new stuent object");
			
			Student tempStudent = new Student("Daffy","Duck","Malmelih@gmail.com") ; 
			//create student object,
			session.beginTransaction() ;
			//save the student object
			System.out.println("Öğrenci Kaydediliyor");
			System.out.println(tempStudent);
			session.save(tempStudent) ; 
			//commit transaction
			session.getTransaction().commit(); 
			
			// read code new code
			System.out.println("Saved student. Generated id " + tempStudent.getId());
			
			//new session and transaction 
			session = factory.getCurrentSession() ; 
			session.beginTransaction() ; 
		
			//retrieve student based on the id: primary key 
			System.out.println("/n getting student with id: ") ;
			
			Student myStudent = session.get(Student.class,tempStudent.getId()) ; 
			//commit the transaction 
			session.getTransaction().commit() ; 
			System.out.println("Done!");
		}finally {
			
		}
}
			}
