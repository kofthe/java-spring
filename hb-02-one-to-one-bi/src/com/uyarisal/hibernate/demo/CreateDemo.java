package com.uyarisal.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.uyarisal.hibernate.demo.entity.Instructor;
import com.uyarisal.hibernate.demo.entity.InstructorDetail;


public class CreateDemo {
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
			//create the objects 
			//associate the objects
			//start a transaction 
			//save the ─▒nstructor
			//this will also save the details object because of CascadeType.ALL
			//commit transaction 
			session.beginTransaction() ;
			Instructor tempInstructor = new Instructor("sddas" , "Ari" , "akadirari@gmail.com"); 
			InstructorDetail tempInstructorDetail = new InstructorDetail("kadirai.com" , "kadir"); 
			tempInstructor.setInstructorDetail(tempInstructorDetail);
			/*Instructor mehmetYoutube = new Instructor("mehmet", "Ari", "1tmhmira@gmail.com"); 
			InstructorDetail mehmetYoutubeDetail= new InstructorDetail("DiziFilmKahve", "YoutUbe"); 
			mehmetYoutube.setInstructorDetail(mehmetYoutubeDetail);*/
			System.out.println("Saving Instructor" + tempInstructor);
			
			session.save(tempInstructor) ; 
			
			
			session.getTransaction().commit(); 
			System.out.println("Done!");
		}finally {
			factory.close();
		}
}
			}
