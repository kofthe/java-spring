package com.uyarisal.hibernate.demo;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.uyarisal.hibernate.demo.entity.Course;
import com.uyarisal.hibernate.demo.entity.Instructor;
import com.uyarisal.hibernate.demo.entity.InstructorDetail;


public class GetInstructorCoursesDemo {
			public static void main(String[] args) {
				// create session factory 
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Instructor.class)
								.addAnnotatedClass(InstructorDetail.class)
								.addAnnotatedClass(Course.class)
								.buildSessionFactory()	; 
		
		//create session 
		
			
		Session session = factory.getCurrentSession() ; 
		
		
		try {
			//start transaction
			session.beginTransaction() ;
			//get instructor for db
			//create some courses 
			//add courses to instructor 
			//save the courses 
			
			int theId = 1 ; 
			Instructor tempInstructor = session.get(Instructor.class,theId); 
			//get course for ınstrustor
			System.out.println("ınstructor " + tempInstructor);
			System.out.println("Courses: " + tempInstructor.getCourses());
			session.getTransaction().commit(); 
			System.out.println("Done!");
		}finally {
			session.close();
			factory.close();
		}
}
			}
