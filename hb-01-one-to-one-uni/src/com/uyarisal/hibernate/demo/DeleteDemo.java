package com.uyarisal.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.uyarisal.hibernate.demo.entity.Instructor;
import com.uyarisal.hibernate.demo.entity.InstructorDetail;


public class DeleteDemo{
			public static void main(String[] args) {
				// create session factory 
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.buildSessionFactory()	; 
		
		//create session 
			
		Session session = factory.getCurrentSession() ; 
		
		
		try {
			 //get ─▒nstructor for id 
			//delete the ─▒nstructors
			session.beginTransaction() ;
			int theId = 4 ; 
			Instructor tempInstructor = session.get(Instructor.class, theId) ; 
			System.out.println("Found Instructor");
			if(tempInstructor != null) {
				System.out.println("Deleting: " +tempInstructor);
				session.delete(tempInstructor);	
			} 
			
			
			session.getTransaction().commit(); 
			System.out.println("Done!");
		}finally {
			factory.close();
		}
}
			}
