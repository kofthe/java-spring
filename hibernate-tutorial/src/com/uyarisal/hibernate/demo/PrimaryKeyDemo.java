package com.uyarisal.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.uyarisal.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
					
					Student tempStudent = new Student("mehmet","ARi","hqlmania@gmail.com") ; 
					Student tempStudent2 = new Student("Nurullah" , "Uysal" , " nurullah@gmail.com") ; 
					Student tempStudent3 = new Student ("Merhaba" ,"Canim", "Geliyorue@gmail.com") ;
					//create student object,
					session.beginTransaction() ;
					//save the student object
					System.out.println("Öğrenci Kaydediliyor");
					session.save(tempStudent) ; 
					session.save(tempStudent2) ; 
					session.save(tempStudent3) ;
					//commit transaction
					session.getTransaction().commit(); 
					System.out.println("Done!");
				}finally {
					
				}
		}
	}


